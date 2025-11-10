/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Compliance Summary <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Compliance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Compliance extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "complianceState",
        "confirmedTargetCount",
        "nonCompliantTargetCount"
    })
    public Compliance(
            String complianceState, Integer confirmedTargetCount, Integer nonCompliantTargetCount) {
        super();
        this.complianceState = complianceState;
        this.confirmedTargetCount = confirmedTargetCount;
        this.nonCompliantTargetCount = nonCompliantTargetCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Compliance State. */
        @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
        private String complianceState;

        /**
         * Compliance State.
         *
         * @param complianceState the value to set
         * @return this builder
         */
        public Builder complianceState(String complianceState) {
            this.complianceState = complianceState;
            this.__explicitlySet__.add("complianceState");
            return this;
        }
        /** Confirmed Target Count. */
        @com.fasterxml.jackson.annotation.JsonProperty("confirmedTargetCount")
        private Integer confirmedTargetCount;

        /**
         * Confirmed Target Count.
         *
         * @param confirmedTargetCount the value to set
         * @return this builder
         */
        public Builder confirmedTargetCount(Integer confirmedTargetCount) {
            this.confirmedTargetCount = confirmedTargetCount;
            this.__explicitlySet__.add("confirmedTargetCount");
            return this;
        }
        /** Non Compliant Target Count. */
        @com.fasterxml.jackson.annotation.JsonProperty("nonCompliantTargetCount")
        private Integer nonCompliantTargetCount;

        /**
         * Non Compliant Target Count.
         *
         * @param nonCompliantTargetCount the value to set
         * @return this builder
         */
        public Builder nonCompliantTargetCount(Integer nonCompliantTargetCount) {
            this.nonCompliantTargetCount = nonCompliantTargetCount;
            this.__explicitlySet__.add("nonCompliantTargetCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Compliance build() {
            Compliance model =
                    new Compliance(
                            this.complianceState,
                            this.confirmedTargetCount,
                            this.nonCompliantTargetCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Compliance model) {
            if (model.wasPropertyExplicitlySet("complianceState")) {
                this.complianceState(model.getComplianceState());
            }
            if (model.wasPropertyExplicitlySet("confirmedTargetCount")) {
                this.confirmedTargetCount(model.getConfirmedTargetCount());
            }
            if (model.wasPropertyExplicitlySet("nonCompliantTargetCount")) {
                this.nonCompliantTargetCount(model.getNonCompliantTargetCount());
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

    /** Compliance State. */
    @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
    private final String complianceState;

    /**
     * Compliance State.
     *
     * @return the value
     */
    public String getComplianceState() {
        return complianceState;
    }

    /** Confirmed Target Count. */
    @com.fasterxml.jackson.annotation.JsonProperty("confirmedTargetCount")
    private final Integer confirmedTargetCount;

    /**
     * Confirmed Target Count.
     *
     * @return the value
     */
    public Integer getConfirmedTargetCount() {
        return confirmedTargetCount;
    }

    /** Non Compliant Target Count. */
    @com.fasterxml.jackson.annotation.JsonProperty("nonCompliantTargetCount")
    private final Integer nonCompliantTargetCount;

    /**
     * Non Compliant Target Count.
     *
     * @return the value
     */
    public Integer getNonCompliantTargetCount() {
        return nonCompliantTargetCount;
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
        sb.append("Compliance(");
        sb.append("super=").append(super.toString());
        sb.append("complianceState=").append(String.valueOf(this.complianceState));
        sb.append(", confirmedTargetCount=").append(String.valueOf(this.confirmedTargetCount));
        sb.append(", nonCompliantTargetCount=")
                .append(String.valueOf(this.nonCompliantTargetCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Compliance)) {
            return false;
        }

        Compliance other = (Compliance) o;
        return java.util.Objects.equals(this.complianceState, other.complianceState)
                && java.util.Objects.equals(this.confirmedTargetCount, other.confirmedTargetCount)
                && java.util.Objects.equals(
                        this.nonCompliantTargetCount, other.nonCompliantTargetCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.complianceState == null ? 43 : this.complianceState.hashCode());
        result =
                (result * PRIME)
                        + (this.confirmedTargetCount == null
                                ? 43
                                : this.confirmedTargetCount.hashCode());
        result =
                (result * PRIME)
                        + (this.nonCompliantTargetCount == null
                                ? 43
                                : this.nonCompliantTargetCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
