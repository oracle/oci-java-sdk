/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Details for switching over a blue/green deployment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SwitchoverBlueGreenDeploymentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SwitchoverBlueGreenDeploymentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"waitTimeInSeconds"})
    public SwitchoverBlueGreenDeploymentDetails(Integer waitTimeInSeconds) {
        super();
        this.waitTimeInSeconds = waitTimeInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Upper bound guidance, in seconds, for waiting while the target DB System applies
         * remaining replication changes during switchover processing.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("waitTimeInSeconds")
        private Integer waitTimeInSeconds;

        /**
         * Upper bound guidance, in seconds, for waiting while the target DB System applies
         * remaining replication changes during switchover processing.
         *
         * @param waitTimeInSeconds the value to set
         * @return this builder
         */
        public Builder waitTimeInSeconds(Integer waitTimeInSeconds) {
            this.waitTimeInSeconds = waitTimeInSeconds;
            this.__explicitlySet__.add("waitTimeInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SwitchoverBlueGreenDeploymentDetails build() {
            SwitchoverBlueGreenDeploymentDetails model =
                    new SwitchoverBlueGreenDeploymentDetails(this.waitTimeInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SwitchoverBlueGreenDeploymentDetails model) {
            if (model.wasPropertyExplicitlySet("waitTimeInSeconds")) {
                this.waitTimeInSeconds(model.getWaitTimeInSeconds());
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
     * Upper bound guidance, in seconds, for waiting while the target DB System applies remaining
     * replication changes during switchover processing.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("waitTimeInSeconds")
    private final Integer waitTimeInSeconds;

    /**
     * Upper bound guidance, in seconds, for waiting while the target DB System applies remaining
     * replication changes during switchover processing.
     *
     * @return the value
     */
    public Integer getWaitTimeInSeconds() {
        return waitTimeInSeconds;
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
        sb.append("SwitchoverBlueGreenDeploymentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("waitTimeInSeconds=").append(String.valueOf(this.waitTimeInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SwitchoverBlueGreenDeploymentDetails)) {
            return false;
        }

        SwitchoverBlueGreenDeploymentDetails other = (SwitchoverBlueGreenDeploymentDetails) o;
        return java.util.Objects.equals(this.waitTimeInSeconds, other.waitTimeInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.waitTimeInSeconds == null ? 43 : this.waitTimeInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
