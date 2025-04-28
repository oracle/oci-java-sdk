/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of the allowed SQLs to be deleted from the SQL firewall policy. <br>
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
        builder = BulkDeleteSqlFirewallAllowedSqlsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BulkDeleteSqlFirewallAllowedSqlsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sqlFirewallPolicyId", "selection"})
    public BulkDeleteSqlFirewallAllowedSqlsDetails(
            String sqlFirewallPolicyId, SelectionDetails selection) {
        super();
        this.sqlFirewallPolicyId = sqlFirewallPolicyId;
        this.selection = selection;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the SQL firewall policy whose allowed SQLs needs to be deleted. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlFirewallPolicyId")
        private String sqlFirewallPolicyId;

        /**
         * The OCID of the SQL firewall policy whose allowed SQLs needs to be deleted.
         *
         * @param sqlFirewallPolicyId the value to set
         * @return this builder
         */
        public Builder sqlFirewallPolicyId(String sqlFirewallPolicyId) {
            this.sqlFirewallPolicyId = sqlFirewallPolicyId;
            this.__explicitlySet__.add("sqlFirewallPolicyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("selection")
        private SelectionDetails selection;

        public Builder selection(SelectionDetails selection) {
            this.selection = selection;
            this.__explicitlySet__.add("selection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkDeleteSqlFirewallAllowedSqlsDetails build() {
            BulkDeleteSqlFirewallAllowedSqlsDetails model =
                    new BulkDeleteSqlFirewallAllowedSqlsDetails(
                            this.sqlFirewallPolicyId, this.selection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkDeleteSqlFirewallAllowedSqlsDetails model) {
            if (model.wasPropertyExplicitlySet("sqlFirewallPolicyId")) {
                this.sqlFirewallPolicyId(model.getSqlFirewallPolicyId());
            }
            if (model.wasPropertyExplicitlySet("selection")) {
                this.selection(model.getSelection());
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

    /** The OCID of the SQL firewall policy whose allowed SQLs needs to be deleted. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlFirewallPolicyId")
    private final String sqlFirewallPolicyId;

    /**
     * The OCID of the SQL firewall policy whose allowed SQLs needs to be deleted.
     *
     * @return the value
     */
    public String getSqlFirewallPolicyId() {
        return sqlFirewallPolicyId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("selection")
    private final SelectionDetails selection;

    public SelectionDetails getSelection() {
        return selection;
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
        sb.append("BulkDeleteSqlFirewallAllowedSqlsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sqlFirewallPolicyId=").append(String.valueOf(this.sqlFirewallPolicyId));
        sb.append(", selection=").append(String.valueOf(this.selection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkDeleteSqlFirewallAllowedSqlsDetails)) {
            return false;
        }

        BulkDeleteSqlFirewallAllowedSqlsDetails other = (BulkDeleteSqlFirewallAllowedSqlsDetails) o;
        return java.util.Objects.equals(this.sqlFirewallPolicyId, other.sqlFirewallPolicyId)
                && java.util.Objects.equals(this.selection, other.selection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sqlFirewallPolicyId == null
                                ? 43
                                : this.sqlFirewallPolicyId.hashCode());
        result = (result * PRIME) + (this.selection == null ? 43 : this.selection.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
