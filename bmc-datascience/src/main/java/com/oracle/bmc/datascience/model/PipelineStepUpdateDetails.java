/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The details of the step to update. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "stepType",
        defaultImpl = PipelineStepUpdateDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PipelineDataflowStepUpdateDetails.class,
            name = "DATAFLOW"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PipelineMLJobStepUpdateDetails.class,
            name = "ML_JOB"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PipelineCustomScriptStepUpdateDetails.class,
            name = "CUSTOM_SCRIPT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PipelineContainerStepUpdateDetails.class,
            name = "CONTAINER")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class PipelineStepUpdateDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"stepName", "description", "stepConfigurationDetails"})
    protected PipelineStepUpdateDetails(
            String stepName,
            String description,
            PipelineStepConfigurationDetails stepConfigurationDetails) {
        super();
        this.stepName = stepName;
        this.description = description;
        this.stepConfigurationDetails = stepConfigurationDetails;
    }

    /** The name of the step. */
    @com.fasterxml.jackson.annotation.JsonProperty("stepName")
    private final String stepName;

    /**
     * The name of the step.
     *
     * @return the value
     */
    public String getStepName() {
        return stepName;
    }

    /** A short description of the step. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the step.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stepConfigurationDetails")
    private final PipelineStepConfigurationDetails stepConfigurationDetails;

    public PipelineStepConfigurationDetails getStepConfigurationDetails() {
        return stepConfigurationDetails;
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
        sb.append("PipelineStepUpdateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("stepName=").append(String.valueOf(this.stepName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", stepConfigurationDetails=")
                .append(String.valueOf(this.stepConfigurationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineStepUpdateDetails)) {
            return false;
        }

        PipelineStepUpdateDetails other = (PipelineStepUpdateDetails) o;
        return java.util.Objects.equals(this.stepName, other.stepName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.stepConfigurationDetails, other.stepConfigurationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stepName == null ? 43 : this.stepName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.stepConfigurationDetails == null
                                ? 43
                                : this.stepConfigurationDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of step. */
    public enum StepType implements com.oracle.bmc.http.internal.BmcEnum {
        MlJob("ML_JOB"),
        CustomScript("CUSTOM_SCRIPT"),
        Container("CONTAINER"),
        Dataflow("DATAFLOW"),
        ;

        private final String value;
        private static java.util.Map<String, StepType> map;

        static {
            map = new java.util.HashMap<>();
            for (StepType v : StepType.values()) {
                map.put(v.getValue(), v);
            }
        }

        StepType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StepType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid StepType: " + key);
        }
    };
}
