package br.com.atom.springjwtoauth2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_roles")
public class Role {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleid;

    private String name;

    public enum Values {
        
        ADMIN(1L),
        BASIC(2L);

        long roleId;
        
        Values(long roleId){
            this.roleId = roleId;
        }
    }
    
    public Role(Long roleid, String name) {
        this.roleid = roleid;
        this.name = name;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((roleid == null) ? 0 : roleid.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Role other = (Role) obj;
        if (roleid == null) {
            if (other.roleid != null)
                return false;
        } else if (!roleid.equals(other.roleid))
            return false;
        return true;
    }


   

}
