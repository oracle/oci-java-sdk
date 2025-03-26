/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details of the generated artifact or report.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "outputType",
    defaultImpl = StageOutput.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TestReportOutput.class,
        name = "TEST_REPORT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = GenericArtifacts.class,
        name = "ARTIFACT"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class StageOutput extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"stepName"})
    protected StageOutput(String stepName) {
        super();
        this.stepName = stepName;
    }

    /**
     * Name of stage step at which this output is generated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepName")
    private final String stepName;

    /**
     * Name of stage step at which this output is generated.
     * @return the value
     **/
    public String getStepName() {
        return stepName;
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
        sb.append("StageOutput(");
        sb.append("super=").append(super.toString());
        sb.append("stepName=").append(String.valueOf(this.stepName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StageOutput)) {
            return false;
        }

        StageOutput other = (StageOutput) o;
        return java.util.Objects.equals(this.stepName, other.stepName) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stepName == null ? 43 : this.stepName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Type of output generated.
     **/
    public enum OutputType {
        Artifact("ARTIFACT"),
        TestReport("TEST_REPORT"),
        ;

        private final String value;
        private static java.util.Map<String, OutputType> map;

        static {
            map = new java.util.HashMap<>();
            for (OutputType v : OutputType.values()) {
                map.put(v.getValue(), v);
            }
        }

        OutputType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OutputType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid OutputType: " + key);
        }
    };
}
