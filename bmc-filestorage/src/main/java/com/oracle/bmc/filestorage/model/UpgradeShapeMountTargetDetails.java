/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Shape details about the Mount Target. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpgradeShapeMountTargetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpgradeShapeMountTargetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"requestedThroughput"})
    public UpgradeShapeMountTargetDetails(Long requestedThroughput) {
        super();
        this.requestedThroughput = requestedThroughput;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * New throughput for mount target in Gbps. Available shapes and corresponding throughput
         * are listed at [Mount Target
         * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requestedThroughput")
        private Long requestedThroughput;

        /**
         * New throughput for mount target in Gbps. Available shapes and corresponding throughput
         * are listed at [Mount Target
         * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
         *
         * @param requestedThroughput the value to set
         * @return this builder
         */
        public Builder requestedThroughput(Long requestedThroughput) {
            this.requestedThroughput = requestedThroughput;
            this.__explicitlySet__.add("requestedThroughput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpgradeShapeMountTargetDetails build() {
            UpgradeShapeMountTargetDetails model =
                    new UpgradeShapeMountTargetDetails(this.requestedThroughput);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpgradeShapeMountTargetDetails model) {
            if (model.wasPropertyExplicitlySet("requestedThroughput")) {
                this.requestedThroughput(model.getRequestedThroughput());
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
     * New throughput for mount target in Gbps. Available shapes and corresponding throughput are
     * listed at [Mount Target
     * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestedThroughput")
    private final Long requestedThroughput;

    /**
     * New throughput for mount target in Gbps. Available shapes and corresponding throughput are
     * listed at [Mount Target
     * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
     *
     * @return the value
     */
    public Long getRequestedThroughput() {
        return requestedThroughput;
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
        sb.append("UpgradeShapeMountTargetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("requestedThroughput=").append(String.valueOf(this.requestedThroughput));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpgradeShapeMountTargetDetails)) {
            return false;
        }

        UpgradeShapeMountTargetDetails other = (UpgradeShapeMountTargetDetails) o;
        return java.util.Objects.equals(this.requestedThroughput, other.requestedThroughput)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.requestedThroughput == null
                                ? 43
                                : this.requestedThroughput.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
