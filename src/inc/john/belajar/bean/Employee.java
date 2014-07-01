package inc.john.belajar.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee implements Serializable {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="ID")
    private Long id;
    @Column(name="NAME")
    private String name;
    @Column(name="NO_HANDPHONE")
    private String noHandPhone;
    
    // Constructor
    public Employee() { }

    public Employee(Long id) {
        this.id = id;
    }
    
    public Employee(Long id, String name, String noHandPhone) {
        this.id = id;
        this.name = name;
        this.noHandPhone = noHandPhone;
    }
    
    // Getter And Setter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNoHandPhone() {
        return noHandPhone;
    }
    public void setNoHandPhone(String noHandPhone) {
        this.noHandPhone = noHandPhone;
    }
    
}
