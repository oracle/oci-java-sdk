/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The network validation response.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TestNetworkConnectivity.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TestNetworkConnectivity
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "networkValidationOutput",
        "isReachable",
        "exceptionMessage"
    })
    public TestNetworkConnectivity(
            String networkValidationOutput, Boolean isReachable, String exceptionMessage) {
        super();
        this.networkValidationOutput = networkValidationOutput;
        this.isReachable = isReachable;
        this.exceptionMessage = exceptionMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Last line from network validation command execution output.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkValidationOutput")
        private String networkValidationOutput;

        /**
         * Last line from network validation command execution output.
         * @param networkValidationOutput the value to set
         * @return this builder
         **/
        public Builder networkValidationOutput(String networkValidationOutput) {
            this.networkValidationOutput = networkValidationOutput;
            this.__explicitlySet__.add("networkValidationOutput");
            return this;
        }
        /**
         * True if the data asset has a valid network path.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isReachable")
        private Boolean isReachable;

        /**
         * True if the data asset has a valid network path.
         * @param isReachable the value to set
         * @return this builder
         **/
        public Builder isReachable(Boolean isReachable) {
            this.isReachable = isReachable;
            this.__explicitlySet__.add("isReachable");
            return this;
        }
        /**
         * Exception or error message encountered while testing network reachability for the data asset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exceptionMessage")
        private String exceptionMessage;

        /**
         * Exception or error message encountered while testing network reachability for the data asset.
         * @param exceptionMessage the value to set
         * @return this builder
         **/
        public Builder exceptionMessage(String exceptionMessage) {
            this.exceptionMessage = exceptionMessage;
            this.__explicitlySet__.add("exceptionMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TestNetworkConnectivity build() {
            TestNetworkConnectivity model =
                    new TestNetworkConnectivity(
                            this.networkValidationOutput, this.isReachable, this.exceptionMessage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestNetworkConnectivity model) {
            if (model.wasPropertyExplicitlySet("networkValidationOutput")) {
                this.networkValidationOutput(model.getNetworkValidationOutput());
            }
            if (model.wasPropertyExplicitlySet("isReachable")) {
                this.isReachable(model.getIsReachable());
            }
            if (model.wasPropertyExplicitlySet("exceptionMessage")) {
                this.exceptionMessage(model.getExceptionMessage());
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
     * Last line from network validation command execution output.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkValidationOutput")
    private final String networkValidationOutput;

    /**
     * Last line from network validation command execution output.
     * @return the value
     **/
    public String getNetworkValidationOutput() {
        return networkValidationOutput;
    }

    /**
     * True if the data asset has a valid network path.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReachable")
    private final Boolean isReachable;

    /**
     * True if the data asset has a valid network path.
     * @return the value
     **/
    public Boolean getIsReachable() {
        return isReachable;
    }

    /**
     * Exception or error message encountered while testing network reachability for the data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exceptionMessage")
    private final String exceptionMessage;

    /**
     * Exception or error message encountered while testing network reachability for the data asset.
     * @return the value
     **/
    public String getExceptionMessage() {
        return exceptionMessage;
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
        sb.append("TestNetworkConnectivity(");
        sb.append("super=").append(super.toString());
        sb.append("networkValidationOutput=").append(String.valueOf(this.networkValidationOutput));
        sb.append(", isReachable=").append(String.valueOf(this.isReachable));
        sb.append(", exceptionMessage=").append(String.valueOf(this.exceptionMessage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestNetworkConnectivity)) {
            return false;
        }

        TestNetworkConnectivity other = (TestNetworkConnectivity) o;
        return java.util.Objects.equals(this.networkValidationOutput, other.networkValidationOutput)
                && java.util.Objects.equals(this.isReachable, other.isReachable)
                && java.util.Objects.equals(this.exceptionMessage, other.exceptionMessage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.networkValidationOutput == null
                                ? 43
                                : this.networkValidationOutput.hashCode());
        result = (result * PRIME) + (this.isReachable == null ? 43 : this.isReachable.hashCode());
        result =
                (result * PRIME)
                        + (this.exceptionMessage == null ? 43 : this.exceptionMessage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
