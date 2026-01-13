/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The summary of user role grant paths. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RoleGrantPathSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RoleGrantPathSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "grantee", "grantedRole", "depthLevel"})
    public RoleGrantPathSummary(
            String key, String grantee, String grantedRole, Integer depthLevel) {
        super();
        this.key = key;
        this.grantee = grantee;
        this.grantedRole = grantedRole;
        this.depthLevel = depthLevel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique key of a role grant. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key of a role grant.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** Grantee is the user who can access the table. */
        @com.fasterxml.jackson.annotation.JsonProperty("grantee")
        private String grantee;

        /**
         * Grantee is the user who can access the table.
         *
         * @param grantee the value to set
         * @return this builder
         */
        public Builder grantee(String grantee) {
            this.grantee = grantee;
            this.__explicitlySet__.add("grantee");
            return this;
        }
        /** The name of the role. */
        @com.fasterxml.jackson.annotation.JsonProperty("grantedRole")
        private String grantedRole;

        /**
         * The name of the role.
         *
         * @param grantedRole the value to set
         * @return this builder
         */
        public Builder grantedRole(String grantedRole) {
            this.grantedRole = grantedRole;
            this.__explicitlySet__.add("grantedRole");
            return this;
        }
        /**
         * The grant depth level of the indirect grant. An indirectly granted role/privilege is
         * granted to the user through another role. The depth level indicates how deep a privilege
         * is within the grant hierarchy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("depthLevel")
        private Integer depthLevel;

        /**
         * The grant depth level of the indirect grant. An indirectly granted role/privilege is
         * granted to the user through another role. The depth level indicates how deep a privilege
         * is within the grant hierarchy.
         *
         * @param depthLevel the value to set
         * @return this builder
         */
        public Builder depthLevel(Integer depthLevel) {
            this.depthLevel = depthLevel;
            this.__explicitlySet__.add("depthLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RoleGrantPathSummary build() {
            RoleGrantPathSummary model =
                    new RoleGrantPathSummary(
                            this.key, this.grantee, this.grantedRole, this.depthLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoleGrantPathSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("grantee")) {
                this.grantee(model.getGrantee());
            }
            if (model.wasPropertyExplicitlySet("grantedRole")) {
                this.grantedRole(model.getGrantedRole());
            }
            if (model.wasPropertyExplicitlySet("depthLevel")) {
                this.depthLevel(model.getDepthLevel());
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

    /** The unique key of a role grant. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key of a role grant.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** Grantee is the user who can access the table. */
    @com.fasterxml.jackson.annotation.JsonProperty("grantee")
    private final String grantee;

    /**
     * Grantee is the user who can access the table.
     *
     * @return the value
     */
    public String getGrantee() {
        return grantee;
    }

    /** The name of the role. */
    @com.fasterxml.jackson.annotation.JsonProperty("grantedRole")
    private final String grantedRole;

    /**
     * The name of the role.
     *
     * @return the value
     */
    public String getGrantedRole() {
        return grantedRole;
    }

    /**
     * The grant depth level of the indirect grant. An indirectly granted role/privilege is granted
     * to the user through another role. The depth level indicates how deep a privilege is within
     * the grant hierarchy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("depthLevel")
    private final Integer depthLevel;

    /**
     * The grant depth level of the indirect grant. An indirectly granted role/privilege is granted
     * to the user through another role. The depth level indicates how deep a privilege is within
     * the grant hierarchy.
     *
     * @return the value
     */
    public Integer getDepthLevel() {
        return depthLevel;
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
        sb.append("RoleGrantPathSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", grantee=").append(String.valueOf(this.grantee));
        sb.append(", grantedRole=").append(String.valueOf(this.grantedRole));
        sb.append(", depthLevel=").append(String.valueOf(this.depthLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoleGrantPathSummary)) {
            return false;
        }

        RoleGrantPathSummary other = (RoleGrantPathSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.grantee, other.grantee)
                && java.util.Objects.equals(this.grantedRole, other.grantedRole)
                && java.util.Objects.equals(this.depthLevel, other.depthLevel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.grantee == null ? 43 : this.grantee.hashCode());
        result = (result * PRIME) + (this.grantedRole == null ? 43 : this.grantedRole.hashCode());
        result = (result * PRIME) + (this.depthLevel == null ? 43 : this.depthLevel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
