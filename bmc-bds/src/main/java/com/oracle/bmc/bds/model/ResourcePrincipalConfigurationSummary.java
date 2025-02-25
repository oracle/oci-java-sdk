/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Resource Principal Session Token Details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourcePrincipalConfigurationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourcePrincipalConfigurationSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "bdsInstanceId",
        "displayName",
        "lifecycleState",
        "timeTokenRefreshed",
        "timeTokenExpiry",
        "timeCreated",
        "timeUpdated"
    })
    public ResourcePrincipalConfigurationSummary(
            String id,
            String bdsInstanceId,
            String displayName,
            ResourcePrincipalConfiguration.LifecycleState lifecycleState,
            java.util.Date timeTokenRefreshed,
            java.util.Date timeTokenExpiry,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.bdsInstanceId = bdsInstanceId;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.timeTokenRefreshed = timeTokenRefreshed;
        this.timeTokenExpiry = timeTokenExpiry;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * the ID of the ResourcePrincipalConfiguration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * the ID of the ResourcePrincipalConfiguration.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * the OCID of the bdsInstance which is the parent resource id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bdsInstanceId")
        private String bdsInstanceId;

        /**
         * the OCID of the bdsInstance which is the parent resource id.
         * @param bdsInstanceId the value to set
         * @return this builder
         **/
        public Builder bdsInstanceId(String bdsInstanceId) {
            this.bdsInstanceId = bdsInstanceId;
            this.__explicitlySet__.add("bdsInstanceId");
            return this;
        }
        /**
         * a user-friendly name. only ascii alphanumeric characters with no spaces allowed. the name does not have to be unique, and it may be changed. avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * a user-friendly name. only ascii alphanumeric characters with no spaces allowed. the name does not have to be unique, and it may be changed. avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * the state of the ResourcePrincipalConfiguration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ResourcePrincipalConfiguration.LifecycleState lifecycleState;

        /**
         * the state of the ResourcePrincipalConfiguration.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(
                ResourcePrincipalConfiguration.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * the time the resource principal session token was refreshed, shown as an rfc 3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeTokenRefreshed")
        private java.util.Date timeTokenRefreshed;

        /**
         * the time the resource principal session token was refreshed, shown as an rfc 3339 formatted datetime string.
         * @param timeTokenRefreshed the value to set
         * @return this builder
         **/
        public Builder timeTokenRefreshed(java.util.Date timeTokenRefreshed) {
            this.timeTokenRefreshed = timeTokenRefreshed;
            this.__explicitlySet__.add("timeTokenRefreshed");
            return this;
        }
        /**
         * the time the resource principal session token will expired, shown as an rfc 3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeTokenExpiry")
        private java.util.Date timeTokenExpiry;

        /**
         * the time the resource principal session token will expired, shown as an rfc 3339 formatted datetime string.
         * @param timeTokenExpiry the value to set
         * @return this builder
         **/
        public Builder timeTokenExpiry(java.util.Date timeTokenExpiry) {
            this.timeTokenExpiry = timeTokenExpiry;
            this.__explicitlySet__.add("timeTokenExpiry");
            return this;
        }
        /**
         * the time the ResourcePrincipalConfiguration was created, shown as an rfc 3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * the time the ResourcePrincipalConfiguration was created, shown as an rfc 3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * the time the ResourcePrincipalConfiguration was updated, shown as an rfc 3339 formatted datetime string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * the time the ResourcePrincipalConfiguration was updated, shown as an rfc 3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourcePrincipalConfigurationSummary build() {
            ResourcePrincipalConfigurationSummary model =
                    new ResourcePrincipalConfigurationSummary(
                            this.id,
                            this.bdsInstanceId,
                            this.displayName,
                            this.lifecycleState,
                            this.timeTokenRefreshed,
                            this.timeTokenExpiry,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourcePrincipalConfigurationSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("bdsInstanceId")) {
                this.bdsInstanceId(model.getBdsInstanceId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeTokenRefreshed")) {
                this.timeTokenRefreshed(model.getTimeTokenRefreshed());
            }
            if (model.wasPropertyExplicitlySet("timeTokenExpiry")) {
                this.timeTokenExpiry(model.getTimeTokenExpiry());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * the ID of the ResourcePrincipalConfiguration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * the ID of the ResourcePrincipalConfiguration.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * the OCID of the bdsInstance which is the parent resource id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdsInstanceId")
    private final String bdsInstanceId;

    /**
     * the OCID of the bdsInstance which is the parent resource id.
     * @return the value
     **/
    public String getBdsInstanceId() {
        return bdsInstanceId;
    }

    /**
     * a user-friendly name. only ascii alphanumeric characters with no spaces allowed. the name does not have to be unique, and it may be changed. avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * a user-friendly name. only ascii alphanumeric characters with no spaces allowed. the name does not have to be unique, and it may be changed. avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * the state of the ResourcePrincipalConfiguration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ResourcePrincipalConfiguration.LifecycleState lifecycleState;

    /**
     * the state of the ResourcePrincipalConfiguration.
     * @return the value
     **/
    public ResourcePrincipalConfiguration.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * the time the resource principal session token was refreshed, shown as an rfc 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTokenRefreshed")
    private final java.util.Date timeTokenRefreshed;

    /**
     * the time the resource principal session token was refreshed, shown as an rfc 3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeTokenRefreshed() {
        return timeTokenRefreshed;
    }

    /**
     * the time the resource principal session token will expired, shown as an rfc 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTokenExpiry")
    private final java.util.Date timeTokenExpiry;

    /**
     * the time the resource principal session token will expired, shown as an rfc 3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeTokenExpiry() {
        return timeTokenExpiry;
    }

    /**
     * the time the ResourcePrincipalConfiguration was created, shown as an rfc 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * the time the ResourcePrincipalConfiguration was created, shown as an rfc 3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * the time the ResourcePrincipalConfiguration was updated, shown as an rfc 3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * the time the ResourcePrincipalConfiguration was updated, shown as an rfc 3339 formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResourcePrincipalConfigurationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", bdsInstanceId=").append(String.valueOf(this.bdsInstanceId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeTokenRefreshed=").append(String.valueOf(this.timeTokenRefreshed));
        sb.append(", timeTokenExpiry=").append(String.valueOf(this.timeTokenExpiry));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourcePrincipalConfigurationSummary)) {
            return false;
        }

        ResourcePrincipalConfigurationSummary other = (ResourcePrincipalConfigurationSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.bdsInstanceId, other.bdsInstanceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeTokenRefreshed, other.timeTokenRefreshed)
                && java.util.Objects.equals(this.timeTokenExpiry, other.timeTokenExpiry)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.bdsInstanceId == null ? 43 : this.bdsInstanceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTokenRefreshed == null
                                ? 43
                                : this.timeTokenRefreshed.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTokenExpiry == null ? 43 : this.timeTokenExpiry.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
