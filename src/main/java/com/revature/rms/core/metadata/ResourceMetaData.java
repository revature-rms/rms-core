package com.revature.rms.core.metadata;

abstract class ResourceMetaData {

    //Fields
    private int resourceCreator;

    private String resourceCreationDateTime;

    private int lastModifier;

    private String lastModifiedDateTime;

    private int resourceOwner;

    private boolean currentlyActive;

    //No-Args Constructor
    ResourceMetaData() {}

    //Getters and Setters
    public abstract int getResourceCreator();

    public abstract void setResourceCreator(int resourceCreator);

    public abstract String getResourceCreationDateTime();

    public abstract void setResourceCreationDateTime(String resourceCreationDateTime);

    public abstract int getLastModifier();

    public abstract void setLastModifier(int lastModifier);

    public abstract String getLastModifiedDateTime();

    public abstract void setLastModifiedDateTime(String lastModifiedDateTime);

    public abstract int getResourceOwner();

    public abstract void setResourceOwner(int resourceOwner);

    public abstract boolean getCurrentlyActive();

    public abstract void setCurrentlyActive(boolean currentlyActive);

    @Override
    public String toString() {
        return  "resourceCreator=" + resourceCreator +
                ", resourceCreationDateTime='" + resourceCreationDateTime + '\'' +
                ", lastModifier=" + lastModifier +
                ", lastModifiedDateTime='" + lastModifiedDateTime + '\'' +
                ", resourceOwner=" + resourceOwner +
                ", currentlyActive=" + currentlyActive;
    }
}
