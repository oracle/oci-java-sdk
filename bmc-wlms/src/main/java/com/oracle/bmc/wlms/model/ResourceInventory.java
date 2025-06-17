/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * The inventory of WebLogic domains and managed instances in the selected compartment.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/policiesgs/get-started-with-policies.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourceInventory.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceInventory
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "wlsDomainCount",
        "wlsDomainNotInLatestPatchCount",
        "wlsDomainWithPatchReadinessWarningCount",
        "wlsDomainWithPatchReadinessErrorCount",
        "managedInstanceCount",
        "managedInstanceWithPatchReadinessWarningCount",
        "managedInstanceWithPatchReadinessErrorCount"
    })
    public ResourceInventory(
            Integer wlsDomainCount,
            Integer wlsDomainNotInLatestPatchCount,
            Integer wlsDomainWithPatchReadinessWarningCount,
            Integer wlsDomainWithPatchReadinessErrorCount,
            Integer managedInstanceCount,
            Integer managedInstanceWithPatchReadinessWarningCount,
            Integer managedInstanceWithPatchReadinessErrorCount) {
        super();
        this.wlsDomainCount = wlsDomainCount;
        this.wlsDomainNotInLatestPatchCount = wlsDomainNotInLatestPatchCount;
        this.wlsDomainWithPatchReadinessWarningCount = wlsDomainWithPatchReadinessWarningCount;
        this.wlsDomainWithPatchReadinessErrorCount = wlsDomainWithPatchReadinessErrorCount;
        this.managedInstanceCount = managedInstanceCount;
        this.managedInstanceWithPatchReadinessWarningCount =
                managedInstanceWithPatchReadinessWarningCount;
        this.managedInstanceWithPatchReadinessErrorCount =
                managedInstanceWithPatchReadinessErrorCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of WebLogic domains discovered in the selected compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainCount")
        private Integer wlsDomainCount;

        /**
         * The number of WebLogic domains discovered in the selected compartment.
         *
         * @param wlsDomainCount the value to set
         * @return this builder
         */
        public Builder wlsDomainCount(Integer wlsDomainCount) {
            this.wlsDomainCount = wlsDomainCount;
            this.__explicitlySet__.add("wlsDomainCount");
            return this;
        }
        /** The number of WebLogic domains that are not in the latest patch. */
        @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainNotInLatestPatchCount")
        private Integer wlsDomainNotInLatestPatchCount;

        /**
         * The number of WebLogic domains that are not in the latest patch.
         *
         * @param wlsDomainNotInLatestPatchCount the value to set
         * @return this builder
         */
        public Builder wlsDomainNotInLatestPatchCount(Integer wlsDomainNotInLatestPatchCount) {
            this.wlsDomainNotInLatestPatchCount = wlsDomainNotInLatestPatchCount;
            this.__explicitlySet__.add("wlsDomainNotInLatestPatchCount");
            return this;
        }
        /** The number of WebLogic domains that have warnings in the patch readiness check. */
        @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainWithPatchReadinessWarningCount")
        private Integer wlsDomainWithPatchReadinessWarningCount;

        /**
         * The number of WebLogic domains that have warnings in the patch readiness check.
         *
         * @param wlsDomainWithPatchReadinessWarningCount the value to set
         * @return this builder
         */
        public Builder wlsDomainWithPatchReadinessWarningCount(
                Integer wlsDomainWithPatchReadinessWarningCount) {
            this.wlsDomainWithPatchReadinessWarningCount = wlsDomainWithPatchReadinessWarningCount;
            this.__explicitlySet__.add("wlsDomainWithPatchReadinessWarningCount");
            return this;
        }
        /** The number of WebLogic domains that have errors in the patch readiness check. */
        @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainWithPatchReadinessErrorCount")
        private Integer wlsDomainWithPatchReadinessErrorCount;

        /**
         * The number of WebLogic domains that have errors in the patch readiness check.
         *
         * @param wlsDomainWithPatchReadinessErrorCount the value to set
         * @return this builder
         */
        public Builder wlsDomainWithPatchReadinessErrorCount(
                Integer wlsDomainWithPatchReadinessErrorCount) {
            this.wlsDomainWithPatchReadinessErrorCount = wlsDomainWithPatchReadinessErrorCount;
            this.__explicitlySet__.add("wlsDomainWithPatchReadinessErrorCount");
            return this;
        }
        /** The number of managed instances in the selected compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceCount")
        private Integer managedInstanceCount;

        /**
         * The number of managed instances in the selected compartment.
         *
         * @param managedInstanceCount the value to set
         * @return this builder
         */
        public Builder managedInstanceCount(Integer managedInstanceCount) {
            this.managedInstanceCount = managedInstanceCount;
            this.__explicitlySet__.add("managedInstanceCount");
            return this;
        }
        /**
         * The number of managed instance that have WebLogic domains with warnings in the patch
         * readiness check.
         */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "managedInstanceWithPatchReadinessWarningCount")
        private Integer managedInstanceWithPatchReadinessWarningCount;

        /**
         * The number of managed instance that have WebLogic domains with warnings in the patch
         * readiness check.
         *
         * @param managedInstanceWithPatchReadinessWarningCount the value to set
         * @return this builder
         */
        public Builder managedInstanceWithPatchReadinessWarningCount(
                Integer managedInstanceWithPatchReadinessWarningCount) {
            this.managedInstanceWithPatchReadinessWarningCount =
                    managedInstanceWithPatchReadinessWarningCount;
            this.__explicitlySet__.add("managedInstanceWithPatchReadinessWarningCount");
            return this;
        }
        /**
         * The number of managed instance that have WebLogic domains with errors in the patch
         * readiness check.
         */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "managedInstanceWithPatchReadinessErrorCount")
        private Integer managedInstanceWithPatchReadinessErrorCount;

        /**
         * The number of managed instance that have WebLogic domains with errors in the patch
         * readiness check.
         *
         * @param managedInstanceWithPatchReadinessErrorCount the value to set
         * @return this builder
         */
        public Builder managedInstanceWithPatchReadinessErrorCount(
                Integer managedInstanceWithPatchReadinessErrorCount) {
            this.managedInstanceWithPatchReadinessErrorCount =
                    managedInstanceWithPatchReadinessErrorCount;
            this.__explicitlySet__.add("managedInstanceWithPatchReadinessErrorCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceInventory build() {
            ResourceInventory model =
                    new ResourceInventory(
                            this.wlsDomainCount,
                            this.wlsDomainNotInLatestPatchCount,
                            this.wlsDomainWithPatchReadinessWarningCount,
                            this.wlsDomainWithPatchReadinessErrorCount,
                            this.managedInstanceCount,
                            this.managedInstanceWithPatchReadinessWarningCount,
                            this.managedInstanceWithPatchReadinessErrorCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceInventory model) {
            if (model.wasPropertyExplicitlySet("wlsDomainCount")) {
                this.wlsDomainCount(model.getWlsDomainCount());
            }
            if (model.wasPropertyExplicitlySet("wlsDomainNotInLatestPatchCount")) {
                this.wlsDomainNotInLatestPatchCount(model.getWlsDomainNotInLatestPatchCount());
            }
            if (model.wasPropertyExplicitlySet("wlsDomainWithPatchReadinessWarningCount")) {
                this.wlsDomainWithPatchReadinessWarningCount(
                        model.getWlsDomainWithPatchReadinessWarningCount());
            }
            if (model.wasPropertyExplicitlySet("wlsDomainWithPatchReadinessErrorCount")) {
                this.wlsDomainWithPatchReadinessErrorCount(
                        model.getWlsDomainWithPatchReadinessErrorCount());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceCount")) {
                this.managedInstanceCount(model.getManagedInstanceCount());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceWithPatchReadinessWarningCount")) {
                this.managedInstanceWithPatchReadinessWarningCount(
                        model.getManagedInstanceWithPatchReadinessWarningCount());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceWithPatchReadinessErrorCount")) {
                this.managedInstanceWithPatchReadinessErrorCount(
                        model.getManagedInstanceWithPatchReadinessErrorCount());
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

    /** The number of WebLogic domains discovered in the selected compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainCount")
    private final Integer wlsDomainCount;

    /**
     * The number of WebLogic domains discovered in the selected compartment.
     *
     * @return the value
     */
    public Integer getWlsDomainCount() {
        return wlsDomainCount;
    }

    /** The number of WebLogic domains that are not in the latest patch. */
    @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainNotInLatestPatchCount")
    private final Integer wlsDomainNotInLatestPatchCount;

    /**
     * The number of WebLogic domains that are not in the latest patch.
     *
     * @return the value
     */
    public Integer getWlsDomainNotInLatestPatchCount() {
        return wlsDomainNotInLatestPatchCount;
    }

    /** The number of WebLogic domains that have warnings in the patch readiness check. */
    @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainWithPatchReadinessWarningCount")
    private final Integer wlsDomainWithPatchReadinessWarningCount;

    /**
     * The number of WebLogic domains that have warnings in the patch readiness check.
     *
     * @return the value
     */
    public Integer getWlsDomainWithPatchReadinessWarningCount() {
        return wlsDomainWithPatchReadinessWarningCount;
    }

    /** The number of WebLogic domains that have errors in the patch readiness check. */
    @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainWithPatchReadinessErrorCount")
    private final Integer wlsDomainWithPatchReadinessErrorCount;

    /**
     * The number of WebLogic domains that have errors in the patch readiness check.
     *
     * @return the value
     */
    public Integer getWlsDomainWithPatchReadinessErrorCount() {
        return wlsDomainWithPatchReadinessErrorCount;
    }

    /** The number of managed instances in the selected compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceCount")
    private final Integer managedInstanceCount;

    /**
     * The number of managed instances in the selected compartment.
     *
     * @return the value
     */
    public Integer getManagedInstanceCount() {
        return managedInstanceCount;
    }

    /**
     * The number of managed instance that have WebLogic domains with warnings in the patch
     * readiness check.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceWithPatchReadinessWarningCount")
    private final Integer managedInstanceWithPatchReadinessWarningCount;

    /**
     * The number of managed instance that have WebLogic domains with warnings in the patch
     * readiness check.
     *
     * @return the value
     */
    public Integer getManagedInstanceWithPatchReadinessWarningCount() {
        return managedInstanceWithPatchReadinessWarningCount;
    }

    /**
     * The number of managed instance that have WebLogic domains with errors in the patch readiness
     * check.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceWithPatchReadinessErrorCount")
    private final Integer managedInstanceWithPatchReadinessErrorCount;

    /**
     * The number of managed instance that have WebLogic domains with errors in the patch readiness
     * check.
     *
     * @return the value
     */
    public Integer getManagedInstanceWithPatchReadinessErrorCount() {
        return managedInstanceWithPatchReadinessErrorCount;
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
        sb.append("ResourceInventory(");
        sb.append("super=").append(super.toString());
        sb.append("wlsDomainCount=").append(String.valueOf(this.wlsDomainCount));
        sb.append(", wlsDomainNotInLatestPatchCount=")
                .append(String.valueOf(this.wlsDomainNotInLatestPatchCount));
        sb.append(", wlsDomainWithPatchReadinessWarningCount=")
                .append(String.valueOf(this.wlsDomainWithPatchReadinessWarningCount));
        sb.append(", wlsDomainWithPatchReadinessErrorCount=")
                .append(String.valueOf(this.wlsDomainWithPatchReadinessErrorCount));
        sb.append(", managedInstanceCount=").append(String.valueOf(this.managedInstanceCount));
        sb.append(", managedInstanceWithPatchReadinessWarningCount=")
                .append(String.valueOf(this.managedInstanceWithPatchReadinessWarningCount));
        sb.append(", managedInstanceWithPatchReadinessErrorCount=")
                .append(String.valueOf(this.managedInstanceWithPatchReadinessErrorCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceInventory)) {
            return false;
        }

        ResourceInventory other = (ResourceInventory) o;
        return java.util.Objects.equals(this.wlsDomainCount, other.wlsDomainCount)
                && java.util.Objects.equals(
                        this.wlsDomainNotInLatestPatchCount, other.wlsDomainNotInLatestPatchCount)
                && java.util.Objects.equals(
                        this.wlsDomainWithPatchReadinessWarningCount,
                        other.wlsDomainWithPatchReadinessWarningCount)
                && java.util.Objects.equals(
                        this.wlsDomainWithPatchReadinessErrorCount,
                        other.wlsDomainWithPatchReadinessErrorCount)
                && java.util.Objects.equals(this.managedInstanceCount, other.managedInstanceCount)
                && java.util.Objects.equals(
                        this.managedInstanceWithPatchReadinessWarningCount,
                        other.managedInstanceWithPatchReadinessWarningCount)
                && java.util.Objects.equals(
                        this.managedInstanceWithPatchReadinessErrorCount,
                        other.managedInstanceWithPatchReadinessErrorCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.wlsDomainCount == null ? 43 : this.wlsDomainCount.hashCode());
        result =
                (result * PRIME)
                        + (this.wlsDomainNotInLatestPatchCount == null
                                ? 43
                                : this.wlsDomainNotInLatestPatchCount.hashCode());
        result =
                (result * PRIME)
                        + (this.wlsDomainWithPatchReadinessWarningCount == null
                                ? 43
                                : this.wlsDomainWithPatchReadinessWarningCount.hashCode());
        result =
                (result * PRIME)
                        + (this.wlsDomainWithPatchReadinessErrorCount == null
                                ? 43
                                : this.wlsDomainWithPatchReadinessErrorCount.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceCount == null
                                ? 43
                                : this.managedInstanceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceWithPatchReadinessWarningCount == null
                                ? 43
                                : this.managedInstanceWithPatchReadinessWarningCount.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceWithPatchReadinessErrorCount == null
                                ? 43
                                : this.managedInstanceWithPatchReadinessErrorCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
