package eventX.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.*;

import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
@EqualsAndHashCode(of = { "code" })
@ToString(of = { "id", "name", "code" })
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

/**
 * Created by SQIM-User on 2017/08/14.
 */
public class Group {
    private static final Logger logger = LoggerFactory.getLogger(Group.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true, updatable = false)
    private Long id;

    @Column(name = "CODE", unique = true, nullable = true)
    @NotEmpty
    private String code; // = "ugid-" + UUID.randomUUID().toString();

    @ManyToOne(cascade = {})
    @JoinColumn(name = "PARENT_ID", nullable = true)
    private Group parent = null;

    @Column(name = "NAME", nullable = false)
    @NotEmpty
    private String name = "";

    @Column(name = "DESCRIPTION", nullable = false, length = 2048)
    @NotNull
    private String description = "";

    /** Order for Groups with same parent. */
    @Column(name = "SORT_ORDER")
    @NotNull
    private int order = 0;

    /** Order by parents first, etc. i.e. hierarchical order. */
    @Column(name = "NATURAL_ORDER")
    private Integer naturalOrder = 0;
}
