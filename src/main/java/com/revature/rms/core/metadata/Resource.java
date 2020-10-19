package com.revature.rms.core.metadata;

import javax.persistence.*;
import java.util.Objects;

public abstract class Resource {

    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected int id;

    @Embedded
    protected ResourceMetadata resourceMetadata;

    public Resource() {
        super();
    }

    public Resource(int id, ResourceMetadata resourceMetadata) {
        this.id = id;
        this.resourceMetadata = resourceMetadata;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public ResourceMetadata getResourceMetadata(){
        return resourceMetadata;
    }

    public void setResourceMetadata(ResourceMetadata resourceMetadata){
        this.resourceMetadata = resourceMetadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resource resource = (Resource) o;
        return id == resource.id &&
                Objects.equals(resourceMetadata, resource.resourceMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resourceMetadata);
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", resourceMetaData=" + resourceMetadata +
                '}';
    }
}
