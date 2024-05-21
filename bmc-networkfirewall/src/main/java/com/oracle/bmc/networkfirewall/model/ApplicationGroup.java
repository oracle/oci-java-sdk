/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * A group of applications.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ApplicationGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApplicationGroup extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "apps", "totalApps", "parentResourceId"})
    public ApplicationGroup(
            String name, java.util.List<String> apps, Integer totalApps, String parentResourceId) {
        super();
        this.name = name;
        this.apps = apps;
        this.totalApps = totalApps;
        this.parentResourceId = parentResourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the application Group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the application Group.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * List of apps in the group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("apps")
        private java.util.List<String> apps;

        /**
         * List of apps in the group.
         * @param apps the value to set
         * @return this builder
         **/
        public Builder apps(java.util.List<String> apps) {
            this.apps = apps;
            this.__explicitlySet__.add("apps");
            return this;
        }
        /**
         * Count of total applications in the given application group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalApps")
        private Integer totalApps;

        /**
         * Count of total applications in the given application group.
         * @param totalApps the value to set
         * @return this builder
         **/
        public Builder totalApps(Integer totalApps) {
            this.totalApps = totalApps;
            this.__explicitlySet__.add("totalApps");
            return this;
        }
        /**
         * OCID of the Network Firewall Policy this application group belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
        private String parentResourceId;

        /**
         * OCID of the Network Firewall Policy this application group belongs to.
         * @param parentResourceId the value to set
         * @return this builder
         **/
        public Builder parentResourceId(String parentResourceId) {
            this.parentResourceId = parentResourceId;
            this.__explicitlySet__.add("parentResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplicationGroup build() {
            ApplicationGroup model =
                    new ApplicationGroup(
                            this.name, this.apps, this.totalApps, this.parentResourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplicationGroup model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("apps")) {
                this.apps(model.getApps());
            }
            if (model.wasPropertyExplicitlySet("totalApps")) {
                this.totalApps(model.getTotalApps());
            }
            if (model.wasPropertyExplicitlySet("parentResourceId")) {
                this.parentResourceId(model.getParentResourceId());
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
     * Name of the application Group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the application Group.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * List of apps in the group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("apps")
    private final java.util.List<String> apps;

    /**
     * List of apps in the group.
     * @return the value
     **/
    public java.util.List<String> getApps() {
        return apps;
    }

    /**
     * Count of total applications in the given application group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalApps")
    private final Integer totalApps;

    /**
     * Count of total applications in the given application group.
     * @return the value
     **/
    public Integer getTotalApps() {
        return totalApps;
    }

    /**
     * OCID of the Network Firewall Policy this application group belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
    private final String parentResourceId;

    /**
     * OCID of the Network Firewall Policy this application group belongs to.
     * @return the value
     **/
    public String getParentResourceId() {
        return parentResourceId;
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
        sb.append("ApplicationGroup(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", apps=").append(String.valueOf(this.apps));
        sb.append(", totalApps=").append(String.valueOf(this.totalApps));
        sb.append(", parentResourceId=").append(String.valueOf(this.parentResourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplicationGroup)) {
            return false;
        }

        ApplicationGroup other = (ApplicationGroup) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.apps, other.apps)
                && java.util.Objects.equals(this.totalApps, other.totalApps)
                && java.util.Objects.equals(this.parentResourceId, other.parentResourceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.apps == null ? 43 : this.apps.hashCode());
        result = (result * PRIME) + (this.totalApps == null ? 43 : this.totalApps.hashCode());
        result =
                (result * PRIME)
                        + (this.parentResourceId == null ? 43 : this.parentResourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
