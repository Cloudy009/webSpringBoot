package net.javaguides.springboot.product;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(nullable = false, unique = true, name = "pro_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 45)
    private String title;

    @Column(length = 15, nullable = false, name = " created_at")
    private String created;

    @Column(length = 45, nullable = false, name = " updated_at")
    private String updated;

    @Column(nullable = false, unique = true , length = 45, name = "image_pro")
    private String image;

    @Column(nullable = false, length = 45)
    private Integer price;

    @Column(nullable = false, length = 45, name = "id_category")
    private Integer idCate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image= image;
    }

    public Integer getIdCate(){ return idCate ;}

    public void  setIdCate(Integer idCate)
    {
        this.idCate = idCate;
    }

    public Integer getPrice(){ return price ;}

    public void  setPrice(Integer price)
    {
        this.price = price;
    }
    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", id_category='" + idCate + '\'' +
                ", created_at ='" + created+ '\'' +
                ", updated_at='" + updated + '\'' +
                ", image_pro ='" + image + '\'' +
                '}';
    }

}
