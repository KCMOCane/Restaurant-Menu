package restaurant;

import java.util.Date;

public class MenuItem {
//private String itemName;
    private String itemName;
    private Double price;
    private String description;
    private String category;
    private Boolean newItem;
    private Date createdAt;

    //getters
    public String getItemName() {
        return itemName;
    }
    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public Boolean isNew() {
        return isNew;
    }
    public Date getCreatedAt() {
        return createdAt;
    }

    //setters
    public void setItemName(String aItemName) {
        this.itemName = aItemName;
    }
    public void setPrice(double aPrice) {
        this.price = aPrice;
    }
    public void setDescription(String aDescription) {
        this.description = aDescription;
    }
    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public void setNew(Boolean aNew) {isNew = aNew; }
        this.isNew = isNew;
    }
    public void setCreatedAt(Date aCreatedAt) {
        this.createdAt = aCreatedAt;
    }




        public MenuItem(String itemName, double price, String description, String category, boolean newItem) {
            this.itemName = itemName;
            this.price = price;
            this.description = description;
            this.category = category;
            this.isNew = isNew;
            this.createdAt = new Date();
        }

            Double price;
            String description;
            String category;
            Boolean isNew;

        }














    }



