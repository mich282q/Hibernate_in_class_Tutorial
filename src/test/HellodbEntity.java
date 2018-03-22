package test;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hellodb", schema = "hibernate", catalog = "")
public class HellodbEntity {
    private Integer i;

    @Basic
    @Column(name = "i")
    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HellodbEntity that = (HellodbEntity) o;
        return Objects.equals(i, that.i);
    }

    @Override
    public int hashCode() {

        return Objects.hash(i);
    }
}
