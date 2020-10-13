package com.revature.rms.core.metadata;

abstract class Resource {

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
}
