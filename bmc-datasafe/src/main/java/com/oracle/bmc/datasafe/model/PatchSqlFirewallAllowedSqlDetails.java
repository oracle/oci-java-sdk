/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details used to delete multiple allowed sqls.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PatchSqlFirewallAllowedSqlDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PatchSqlFirewallAllowedSqlDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"items", "sqlFirewallPolicyId"})
    public PatchSqlFirewallAllowedSqlDetails(
            java.util.List<PatchInstruction> items, String sqlFirewallPolicyId) {
        super();
        this.items = items;
        this.sqlFirewallPolicyId = sqlFirewallPolicyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An array of patch instructions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<PatchInstruction> items;

        /**
         * An array of patch instructions.
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<PatchInstruction> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }
        /**
         * The OCID of the SQL firewall policy whose allowed SQL needs to be deleted.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlFirewallPolicyId")
        private String sqlFirewallPolicyId;

        /**
         * The OCID of the SQL firewall policy whose allowed SQL needs to be deleted.
         * @param sqlFirewallPolicyId the value to set
         * @return this builder
         **/
        public Builder sqlFirewallPolicyId(String sqlFirewallPolicyId) {
            this.sqlFirewallPolicyId = sqlFirewallPolicyId;
            this.__explicitlySet__.add("sqlFirewallPolicyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchSqlFirewallAllowedSqlDetails build() {
            PatchSqlFirewallAllowedSqlDetails model =
                    new PatchSqlFirewallAllowedSqlDetails(this.items, this.sqlFirewallPolicyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchSqlFirewallAllowedSqlDetails model) {
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("sqlFirewallPolicyId")) {
                this.sqlFirewallPolicyId(model.getSqlFirewallPolicyId());
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
     * An array of patch instructions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<PatchInstruction> items;

    /**
     * An array of patch instructions.
     * @return the value
     **/
    public java.util.List<PatchInstruction> getItems() {
        return items;
    }

    /**
     * The OCID of the SQL firewall policy whose allowed SQL needs to be deleted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlFirewallPolicyId")
    private final String sqlFirewallPolicyId;

    /**
     * The OCID of the SQL firewall policy whose allowed SQL needs to be deleted.
     * @return the value
     **/
    public String getSqlFirewallPolicyId() {
        return sqlFirewallPolicyId;
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
        sb.append("PatchSqlFirewallAllowedSqlDetails(");
        sb.append("super=").append(super.toString());
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(", sqlFirewallPolicyId=").append(String.valueOf(this.sqlFirewallPolicyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchSqlFirewallAllowedSqlDetails)) {
            return false;
        }

        PatchSqlFirewallAllowedSqlDetails other = (PatchSqlFirewallAllowedSqlDetails) o;
        return java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.sqlFirewallPolicyId, other.sqlFirewallPolicyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlFirewallPolicyId == null
                                ? 43
                                : this.sqlFirewallPolicyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
