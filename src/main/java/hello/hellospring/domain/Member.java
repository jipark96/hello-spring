package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Column(name="username") 만약 username 일때 사용
    private  String name;

    public Long getId() {
        return id = id;
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


}
