/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MultipleTransferPackages.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MultipleTransferPackages {
    @Deprecated
    @java.beans.ConstructorProperties({"transferPackageObjects"})
    public MultipleTransferPackages(java.util.List<TransferPackageSummary> transferPackageObjects) {
        super();
        this.transferPackageObjects = transferPackageObjects;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("transferPackageObjects")
        private java.util.List<TransferPackageSummary> transferPackageObjects;

        public Builder transferPackageObjects(
                java.util.List<TransferPackageSummary> transferPackageObjects) {
            this.transferPackageObjects = transferPackageObjects;
            this.__explicitlySet__.add("transferPackageObjects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MultipleTransferPackages build() {
            MultipleTransferPackages __instance__ =
                    new MultipleTransferPackages(transferPackageObjects);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MultipleTransferPackages o) {
            Builder copiedBuilder = transferPackageObjects(o.getTransferPackageObjects());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * List of TransferPackage summary's
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transferPackageObjects")
    private final java.util.List<TransferPackageSummary> transferPackageObjects;

    public java.util.List<TransferPackageSummary> getTransferPackageObjects() {
        return transferPackageObjects;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MultipleTransferPackages(");
        sb.append("transferPackageObjects=").append(String.valueOf(this.transferPackageObjects));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MultipleTransferPackages)) {
            return false;
        }

        MultipleTransferPackages other = (MultipleTransferPackages) o;
        return java.util.Objects.equals(this.transferPackageObjects, other.transferPackageObjects)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.transferPackageObjects == null
                                ? 43
                                : this.transferPackageObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
