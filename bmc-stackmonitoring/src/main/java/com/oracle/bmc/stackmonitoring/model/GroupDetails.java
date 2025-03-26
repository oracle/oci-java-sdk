/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * User Group object
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GroupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GroupDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "domain", "stackMonitoringRole"})
    public GroupDetails(String name, String domain, String stackMonitoringRole) {
        super();
        this.name = name;
        this.domain = domain;
        this.stackMonitoringRole = stackMonitoringRole;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of user Group
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of user Group
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Identity domain name
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * Identity domain name
         *
         * @param domain the value to set
         * @return this builder
         **/
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /**
         * Role assigned to user group in context of Stack Monitoring service. Access role can be for example: ADMINISTRATOR, OPERATOR, VIEWER, any other access role
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stackMonitoringRole")
        private String stackMonitoringRole;

        /**
         * Role assigned to user group in context of Stack Monitoring service. Access role can be for example: ADMINISTRATOR, OPERATOR, VIEWER, any other access role
         *
         * @param stackMonitoringRole the value to set
         * @return this builder
         **/
        public Builder stackMonitoringRole(String stackMonitoringRole) {
            this.stackMonitoringRole = stackMonitoringRole;
            this.__explicitlySet__.add("stackMonitoringRole");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GroupDetails build() {
            GroupDetails model = new GroupDetails(this.name, this.domain, this.stackMonitoringRole);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GroupDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("stackMonitoringRole")) {
                this.stackMonitoringRole(model.getStackMonitoringRole());
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
     * Name of user Group
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of user Group
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Identity domain name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * Identity domain name
     *
     * @return the value
     **/
    public String getDomain() {
        return domain;
    }

    /**
     * Role assigned to user group in context of Stack Monitoring service. Access role can be for example: ADMINISTRATOR, OPERATOR, VIEWER, any other access role
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stackMonitoringRole")
    private final String stackMonitoringRole;

    /**
     * Role assigned to user group in context of Stack Monitoring service. Access role can be for example: ADMINISTRATOR, OPERATOR, VIEWER, any other access role
     *
     * @return the value
     **/
    public String getStackMonitoringRole() {
        return stackMonitoringRole;
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
        sb.append("GroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", stackMonitoringRole=").append(String.valueOf(this.stackMonitoringRole));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GroupDetails)) {
            return false;
        }

        GroupDetails other = (GroupDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.stackMonitoringRole, other.stackMonitoringRole)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result =
                (result * PRIME)
                        + (this.stackMonitoringRole == null
                                ? 43
                                : this.stackMonitoringRole.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
