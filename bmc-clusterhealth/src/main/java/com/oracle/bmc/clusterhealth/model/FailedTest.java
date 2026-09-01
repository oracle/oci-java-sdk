/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterhealth.model;

/**
 * summary of a failed test <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FailedTest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FailedTest extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"testName", "recommendedAction"})
    public FailedTest(String testName, String recommendedAction) {
        super();
        this.testName = testName;
        this.recommendedAction = recommendedAction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** name of the test */
        @com.fasterxml.jackson.annotation.JsonProperty("testName")
        private String testName;

        /**
         * name of the test
         *
         * @param testName the value to set
         * @return this builder
         */
        public Builder testName(String testName) {
            this.testName = testName;
            this.__explicitlySet__.add("testName");
            return this;
        }
        /** recommended action */
        @com.fasterxml.jackson.annotation.JsonProperty("recommendedAction")
        private String recommendedAction;

        /**
         * recommended action
         *
         * @param recommendedAction the value to set
         * @return this builder
         */
        public Builder recommendedAction(String recommendedAction) {
            this.recommendedAction = recommendedAction;
            this.__explicitlySet__.add("recommendedAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FailedTest build() {
            FailedTest model = new FailedTest(this.testName, this.recommendedAction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FailedTest model) {
            if (model.wasPropertyExplicitlySet("testName")) {
                this.testName(model.getTestName());
            }
            if (model.wasPropertyExplicitlySet("recommendedAction")) {
                this.recommendedAction(model.getRecommendedAction());
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

    /** name of the test */
    @com.fasterxml.jackson.annotation.JsonProperty("testName")
    private final String testName;

    /**
     * name of the test
     *
     * @return the value
     */
    public String getTestName() {
        return testName;
    }

    /** recommended action */
    @com.fasterxml.jackson.annotation.JsonProperty("recommendedAction")
    private final String recommendedAction;

    /**
     * recommended action
     *
     * @return the value
     */
    public String getRecommendedAction() {
        return recommendedAction;
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
        sb.append("FailedTest(");
        sb.append("super=").append(super.toString());
        sb.append("testName=").append(String.valueOf(this.testName));
        sb.append(", recommendedAction=").append(String.valueOf(this.recommendedAction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FailedTest)) {
            return false;
        }

        FailedTest other = (FailedTest) o;
        return java.util.Objects.equals(this.testName, other.testName)
                && java.util.Objects.equals(this.recommendedAction, other.recommendedAction)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.testName == null ? 43 : this.testName.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendedAction == null ? 43 : this.recommendedAction.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
