/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The Test result details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TestMetricExtensionData.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TestMetricExtensionData
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "testRunId",
        "testRunMetricSuffix",
        "testRunNamespaceName",
        "testRunResourceGroupName"
    })
    public TestMetricExtensionData(
            String testRunId,
            String testRunMetricSuffix,
            String testRunNamespaceName,
            String testRunResourceGroupName) {
        super();
        this.testRunId = testRunId;
        this.testRunMetricSuffix = testRunMetricSuffix;
        this.testRunNamespaceName = testRunNamespaceName;
        this.testRunResourceGroupName = testRunResourceGroupName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Test Run Id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("testRunId")
        private String testRunId;

        /**
         * Test Run Id
         * @param testRunId the value to set
         * @return this builder
         **/
        public Builder testRunId(String testRunId) {
            this.testRunId = testRunId;
            this.__explicitlySet__.add("testRunId");
            return this;
        }
        /**
         * Test Run Metric Suffix
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("testRunMetricSuffix")
        private String testRunMetricSuffix;

        /**
         * Test Run Metric Suffix
         * @param testRunMetricSuffix the value to set
         * @return this builder
         **/
        public Builder testRunMetricSuffix(String testRunMetricSuffix) {
            this.testRunMetricSuffix = testRunMetricSuffix;
            this.__explicitlySet__.add("testRunMetricSuffix");
            return this;
        }
        /**
         * Test Run Namespace name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("testRunNamespaceName")
        private String testRunNamespaceName;

        /**
         * Test Run Namespace name
         * @param testRunNamespaceName the value to set
         * @return this builder
         **/
        public Builder testRunNamespaceName(String testRunNamespaceName) {
            this.testRunNamespaceName = testRunNamespaceName;
            this.__explicitlySet__.add("testRunNamespaceName");
            return this;
        }
        /**
         * Test Run Resource Group name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("testRunResourceGroupName")
        private String testRunResourceGroupName;

        /**
         * Test Run Resource Group name
         * @param testRunResourceGroupName the value to set
         * @return this builder
         **/
        public Builder testRunResourceGroupName(String testRunResourceGroupName) {
            this.testRunResourceGroupName = testRunResourceGroupName;
            this.__explicitlySet__.add("testRunResourceGroupName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TestMetricExtensionData build() {
            TestMetricExtensionData model =
                    new TestMetricExtensionData(
                            this.testRunId,
                            this.testRunMetricSuffix,
                            this.testRunNamespaceName,
                            this.testRunResourceGroupName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestMetricExtensionData model) {
            if (model.wasPropertyExplicitlySet("testRunId")) {
                this.testRunId(model.getTestRunId());
            }
            if (model.wasPropertyExplicitlySet("testRunMetricSuffix")) {
                this.testRunMetricSuffix(model.getTestRunMetricSuffix());
            }
            if (model.wasPropertyExplicitlySet("testRunNamespaceName")) {
                this.testRunNamespaceName(model.getTestRunNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("testRunResourceGroupName")) {
                this.testRunResourceGroupName(model.getTestRunResourceGroupName());
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
     * Test Run Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("testRunId")
    private final String testRunId;

    /**
     * Test Run Id
     * @return the value
     **/
    public String getTestRunId() {
        return testRunId;
    }

    /**
     * Test Run Metric Suffix
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("testRunMetricSuffix")
    private final String testRunMetricSuffix;

    /**
     * Test Run Metric Suffix
     * @return the value
     **/
    public String getTestRunMetricSuffix() {
        return testRunMetricSuffix;
    }

    /**
     * Test Run Namespace name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("testRunNamespaceName")
    private final String testRunNamespaceName;

    /**
     * Test Run Namespace name
     * @return the value
     **/
    public String getTestRunNamespaceName() {
        return testRunNamespaceName;
    }

    /**
     * Test Run Resource Group name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("testRunResourceGroupName")
    private final String testRunResourceGroupName;

    /**
     * Test Run Resource Group name
     * @return the value
     **/
    public String getTestRunResourceGroupName() {
        return testRunResourceGroupName;
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
        sb.append("TestMetricExtensionData(");
        sb.append("super=").append(super.toString());
        sb.append("testRunId=").append(String.valueOf(this.testRunId));
        sb.append(", testRunMetricSuffix=").append(String.valueOf(this.testRunMetricSuffix));
        sb.append(", testRunNamespaceName=").append(String.valueOf(this.testRunNamespaceName));
        sb.append(", testRunResourceGroupName=")
                .append(String.valueOf(this.testRunResourceGroupName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestMetricExtensionData)) {
            return false;
        }

        TestMetricExtensionData other = (TestMetricExtensionData) o;
        return java.util.Objects.equals(this.testRunId, other.testRunId)
                && java.util.Objects.equals(this.testRunMetricSuffix, other.testRunMetricSuffix)
                && java.util.Objects.equals(this.testRunNamespaceName, other.testRunNamespaceName)
                && java.util.Objects.equals(
                        this.testRunResourceGroupName, other.testRunResourceGroupName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.testRunId == null ? 43 : this.testRunId.hashCode());
        result =
                (result * PRIME)
                        + (this.testRunMetricSuffix == null
                                ? 43
                                : this.testRunMetricSuffix.hashCode());
        result =
                (result * PRIME)
                        + (this.testRunNamespaceName == null
                                ? 43
                                : this.testRunNamespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.testRunResourceGroupName == null
                                ? 43
                                : this.testRunResourceGroupName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
