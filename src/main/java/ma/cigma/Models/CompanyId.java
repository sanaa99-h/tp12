package ma.cigma.Models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;


@Embeddable
public class CompanyId implements Serializable {
    private long rc;
    private long idTribunal;
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyId companyId = (CompanyId) o;
        return rc == companyId.rc && idTribunal == companyId.idTribunal;
    }
    @Override
    public int hashCode() {
        return Objects.hash(rc, idTribunal);
    }
}
