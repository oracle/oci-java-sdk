/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * invoke ml application trigger details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InvokeMlApplicationProviderTriggerScheduleActionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "httpActionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InvokeMlApplicationProviderTriggerScheduleActionDetails
        extends ScheduleHttpActionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationInstanceViewId")
        private String mlApplicationInstanceViewId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
         * @param mlApplicationInstanceViewId the value to set
         * @return this builder
         **/
        public Builder mlApplicationInstanceViewId(String mlApplicationInstanceViewId) {
            this.mlApplicationInstanceViewId = mlApplicationInstanceViewId;
            this.__explicitlySet__.add("mlApplicationInstanceViewId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "triggerMlApplicationInstanceViewFlowDetails")
        private TriggerMlApplicationInstanceViewFlowDetails
                triggerMlApplicationInstanceViewFlowDetails;

        public Builder triggerMlApplicationInstanceViewFlowDetails(
                TriggerMlApplicationInstanceViewFlowDetails
                        triggerMlApplicationInstanceViewFlowDetails) {
            this.triggerMlApplicationInstanceViewFlowDetails =
                    triggerMlApplicationInstanceViewFlowDetails;
            this.__explicitlySet__.add("triggerMlApplicationInstanceViewFlowDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InvokeMlApplicationProviderTriggerScheduleActionDetails build() {
            InvokeMlApplicationProviderTriggerScheduleActionDetails model =
                    new InvokeMlApplicationProviderTriggerScheduleActionDetails(
                            this.mlApplicationInstanceViewId,
                            this.triggerMlApplicationInstanceViewFlowDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InvokeMlApplicationProviderTriggerScheduleActionDetails model) {
            if (model.wasPropertyExplicitlySet("mlApplicationInstanceViewId")) {
                this.mlApplicationInstanceViewId(model.getMlApplicationInstanceViewId());
            }
            if (model.wasPropertyExplicitlySet("triggerMlApplicationInstanceViewFlowDetails")) {
                this.triggerMlApplicationInstanceViewFlowDetails(
                        model.getTriggerMlApplicationInstanceViewFlowDetails());
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

    @Deprecated
    public InvokeMlApplicationProviderTriggerScheduleActionDetails(
            String mlApplicationInstanceViewId,
            TriggerMlApplicationInstanceViewFlowDetails
                    triggerMlApplicationInstanceViewFlowDetails) {
        super();
        this.mlApplicationInstanceViewId = mlApplicationInstanceViewId;
        this.triggerMlApplicationInstanceViewFlowDetails =
                triggerMlApplicationInstanceViewFlowDetails;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationInstanceViewId")
    private final String mlApplicationInstanceViewId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
     * @return the value
     **/
    public String getMlApplicationInstanceViewId() {
        return mlApplicationInstanceViewId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("triggerMlApplicationInstanceViewFlowDetails")
    private final TriggerMlApplicationInstanceViewFlowDetails
            triggerMlApplicationInstanceViewFlowDetails;

    public TriggerMlApplicationInstanceViewFlowDetails
            getTriggerMlApplicationInstanceViewFlowDetails() {
        return triggerMlApplicationInstanceViewFlowDetails;
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
        sb.append("InvokeMlApplicationProviderTriggerScheduleActionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", mlApplicationInstanceViewId=")
                .append(String.valueOf(this.mlApplicationInstanceViewId));
        sb.append(", triggerMlApplicationInstanceViewFlowDetails=")
                .append(String.valueOf(this.triggerMlApplicationInstanceViewFlowDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvokeMlApplicationProviderTriggerScheduleActionDetails)) {
            return false;
        }

        InvokeMlApplicationProviderTriggerScheduleActionDetails other =
                (InvokeMlApplicationProviderTriggerScheduleActionDetails) o;
        return java.util.Objects.equals(
                        this.mlApplicationInstanceViewId, other.mlApplicationInstanceViewId)
                && java.util.Objects.equals(
                        this.triggerMlApplicationInstanceViewFlowDetails,
                        other.triggerMlApplicationInstanceViewFlowDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.mlApplicationInstanceViewId == null
                                ? 43
                                : this.mlApplicationInstanceViewId.hashCode());
        result =
                (result * PRIME)
                        + (this.triggerMlApplicationInstanceViewFlowDetails == null
                                ? 43
                                : this.triggerMlApplicationInstanceViewFlowDetails.hashCode());
        return result;
    }
}
