/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane.model;

/**
 * Summary of the tenancy attachment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TenancyAttachmentSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TenancyAttachmentSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "governanceRuleId",
        "tenancyId",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "timeLastAttempted"
    })
    public TenancyAttachmentSummary(
            String id,
            String compartmentId,
            String governanceRuleId,
            String tenancyId,
            TenancyAttachment.LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeLastAttempted) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.governanceRuleId = governanceRuleId;
        this.tenancyId = tenancyId;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeLastAttempted = timeLastAttempted;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Oracle ID
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * tenancy attachment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The Oracle ID
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * tenancy attachment.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The Oracle ID
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * root compartment containing the tenancy attachment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The Oracle ID
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * root compartment containing the tenancy attachment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The Oracle ID
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * governance rule. Every tenancy attachment is associated with a governance rule.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("governanceRuleId")
        private String governanceRuleId;

        /**
         * The Oracle ID
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * governance rule. Every tenancy attachment is associated with a governance rule.
         *
         * @param governanceRuleId the value to set
         * @return this builder
         */
        public Builder governanceRuleId(String governanceRuleId) {
            this.governanceRuleId = governanceRuleId;
            this.__explicitlySet__.add("governanceRuleId");
            return this;
        }
        /**
         * The Oracle ID
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * tenancy to which the governance rule is attached.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * The Oracle ID
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * tenancy to which the governance rule is attached.
         *
         * @param tenancyId the value to set
         * @return this builder
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /** The current state of the tenancy attachment. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private TenancyAttachment.LifecycleState lifecycleState;

        /**
         * The current state of the tenancy attachment.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(TenancyAttachment.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Date and time the tenancy attachment was created. An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the tenancy attachment was created. An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Date and time the tenancy attachment was updated. An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Date and time the tenancy attachment was updated. An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Date and time the tenancy attachment was last attempted. An RFC3339 formatted datetime
         * string.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastAttempted")
        private java.util.Date timeLastAttempted;

        /**
         * Date and time the tenancy attachment was last attempted. An RFC3339 formatted datetime
         * string.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeLastAttempted the value to set
         * @return this builder
         */
        public Builder timeLastAttempted(java.util.Date timeLastAttempted) {
            this.timeLastAttempted = timeLastAttempted;
            this.__explicitlySet__.add("timeLastAttempted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TenancyAttachmentSummary build() {
            TenancyAttachmentSummary model =
                    new TenancyAttachmentSummary(
                            this.id,
                            this.compartmentId,
                            this.governanceRuleId,
                            this.tenancyId,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeLastAttempted);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TenancyAttachmentSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("governanceRuleId")) {
                this.governanceRuleId(model.getGovernanceRuleId());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeLastAttempted")) {
                this.timeLastAttempted(model.getTimeLastAttempted());
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

    /**
     * The Oracle ID ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm))
     * of the tenancy attachment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The Oracle ID ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm))
     * of the tenancy attachment.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The Oracle ID ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm))
     * of the root compartment containing the tenancy attachment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The Oracle ID ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm))
     * of the root compartment containing the tenancy attachment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The Oracle ID ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm))
     * of the governance rule. Every tenancy attachment is associated with a governance rule.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("governanceRuleId")
    private final String governanceRuleId;

    /**
     * The Oracle ID ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm))
     * of the governance rule. Every tenancy attachment is associated with a governance rule.
     *
     * @return the value
     */
    public String getGovernanceRuleId() {
        return governanceRuleId;
    }

    /**
     * The Oracle ID ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm))
     * of the tenancy to which the governance rule is attached.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * The Oracle ID ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm))
     * of the tenancy to which the governance rule is attached.
     *
     * @return the value
     */
    public String getTenancyId() {
        return tenancyId;
    }

    /** The current state of the tenancy attachment. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final TenancyAttachment.LifecycleState lifecycleState;

    /**
     * The current state of the tenancy attachment.
     *
     * @return the value
     */
    public TenancyAttachment.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Date and time the tenancy attachment was created. An RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the tenancy attachment was created. An RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Date and time the tenancy attachment was updated. An RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Date and time the tenancy attachment was updated. An RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Date and time the tenancy attachment was last attempted. An RFC3339 formatted datetime
     * string.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastAttempted")
    private final java.util.Date timeLastAttempted;

    /**
     * Date and time the tenancy attachment was last attempted. An RFC3339 formatted datetime
     * string.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeLastAttempted() {
        return timeLastAttempted;
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
        sb.append("TenancyAttachmentSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", governanceRuleId=").append(String.valueOf(this.governanceRuleId));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeLastAttempted=").append(String.valueOf(this.timeLastAttempted));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TenancyAttachmentSummary)) {
            return false;
        }

        TenancyAttachmentSummary other = (TenancyAttachmentSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.governanceRuleId, other.governanceRuleId)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeLastAttempted, other.timeLastAttempted)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.governanceRuleId == null ? 43 : this.governanceRuleId.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastAttempted == null ? 43 : this.timeLastAttempted.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
