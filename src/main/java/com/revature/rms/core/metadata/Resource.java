package com.revature.rms.core.metadata;

import java.util.Objects;

public abstract class Resource {

    private int id;

    private ResourceMetaData resourceMetaData;

    Resource(int id, ResourceMetaData resourceMetaData) {
        this.id = id;
        this.resourceMetaData = resourceMetaData;
    }

    public abstract int getId();

    public abstract void setId(int id);

    public abstract ResourceMetaData getResourceMetaData();

    public abstract void setResourceMetaData(ResourceMetaData resourceMetaData);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resource resource = (Resource) o;
        return id == resource.id &&
                Objects.equals(resourceMetaData, resource.resourceMetaData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resourceMetaData);
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", resourceMetaData=" + resourceMetaData +
                '}';
    }
}
