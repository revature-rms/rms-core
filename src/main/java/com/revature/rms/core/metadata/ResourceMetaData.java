package com.revature.rms.core.metadata;

import java.util.Objects;

public abstract class ResourceMetaData {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResourceMetaData that = (ResourceMetaData) o;
        return resourceCreator == that.resourceCreator &&
                lastModifier == that.lastModifier &&
                resourceOwner == that.resourceOwner &&
                currentlyActive == that.currentlyActive &&
                Objects.equals(resourceCreationDateTime, that.resourceCreationDateTime) &&
                Objects.equals(lastModifiedDateTime, that.lastModifiedDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceCreator, resourceCreationDateTime, lastModifier, lastModifiedDateTime, resourceOwner, currentlyActive);
    }
}
