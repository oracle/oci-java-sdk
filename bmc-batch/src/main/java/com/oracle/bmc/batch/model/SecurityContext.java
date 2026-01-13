/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.model;

/**
 * Security context for container runtime configuration.
 *
 * <p>See also
 * [docs](https://docs.oracle.com/en-us/iaas/api/#/en/container-instances/20210415/datatypes/LinuxSecurityContext).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SecurityContext.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecurityContext
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"runAsUser", "runAsGroup", "fsGroup"})
    public SecurityContext(Integer runAsUser, Integer runAsGroup, Integer fsGroup) {
        super();
        this.runAsUser = runAsUser;
        this.runAsGroup = runAsGroup;
        this.fsGroup = fsGroup;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** User ID for running processes inside the container. */
        @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
        private Integer runAsUser;

        /**
         * User ID for running processes inside the container.
         *
         * @param runAsUser the value to set
         * @return this builder
         */
        public Builder runAsUser(Integer runAsUser) {
            this.runAsUser = runAsUser;
            this.__explicitlySet__.add("runAsUser");
            return this;
        }
        /** Group ID for running processes inside the container. */
        @com.fasterxml.jackson.annotation.JsonProperty("runAsGroup")
        private Integer runAsGroup;

        /**
         * Group ID for running processes inside the container.
         *
         * @param runAsGroup the value to set
         * @return this builder
         */
        public Builder runAsGroup(Integer runAsGroup) {
            this.runAsGroup = runAsGroup;
            this.__explicitlySet__.add("runAsGroup");
            return this;
        }
        /** A special supplemental group ID that applies to all containers in a pod. */
        @com.fasterxml.jackson.annotation.JsonProperty("fsGroup")
        private Integer fsGroup;

        /**
         * A special supplemental group ID that applies to all containers in a pod.
         *
         * @param fsGroup the value to set
         * @return this builder
         */
        public Builder fsGroup(Integer fsGroup) {
            this.fsGroup = fsGroup;
            this.__explicitlySet__.add("fsGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityContext build() {
            SecurityContext model =
                    new SecurityContext(this.runAsUser, this.runAsGroup, this.fsGroup);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityContext model) {
            if (model.wasPropertyExplicitlySet("runAsUser")) {
                this.runAsUser(model.getRunAsUser());
            }
            if (model.wasPropertyExplicitlySet("runAsGroup")) {
                this.runAsGroup(model.getRunAsGroup());
            }
            if (model.wasPropertyExplicitlySet("fsGroup")) {
                this.fsGroup(model.getFsGroup());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** User ID for running processes inside the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
    private final Integer runAsUser;

    /**
     * User ID for running processes inside the container.
     *
     * @return the value
     */
    public Integer getRunAsUser() {
        return runAsUser;
    }

    /** Group ID for running processes inside the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("runAsGroup")
    private final Integer runAsGroup;

    /**
     * Group ID for running processes inside the container.
     *
     * @return the value
     */
    public Integer getRunAsGroup() {
        return runAsGroup;
    }

    /** A special supplemental group ID that applies to all containers in a pod. */
    @com.fasterxml.jackson.annotation.JsonProperty("fsGroup")
    private final Integer fsGroup;

    /**
     * A special supplemental group ID that applies to all containers in a pod.
     *
     * @return the value
     */
    public Integer getFsGroup() {
        return fsGroup;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SecurityContext(");
        sb.append("super=").append(super.toString());
        sb.append("runAsUser=").append(String.valueOf(this.runAsUser));
        sb.append(", runAsGroup=").append(String.valueOf(this.runAsGroup));
        sb.append(", fsGroup=").append(String.valueOf(this.fsGroup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityContext)) {
            return false;
        }

        SecurityContext other = (SecurityContext) o;
        return java.util.Objects.equals(this.runAsUser, other.runAsUser)
                && java.util.Objects.equals(this.runAsGroup, other.runAsGroup)
                && java.util.Objects.equals(this.fsGroup, other.fsGroup)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runAsUser == null ? 43 : this.runAsUser.hashCode());
        result = (result * PRIME) + (this.runAsGroup == null ? 43 : this.runAsGroup.hashCode());
        result = (result * PRIME) + (this.fsGroup == null ? 43 : this.fsGroup.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
