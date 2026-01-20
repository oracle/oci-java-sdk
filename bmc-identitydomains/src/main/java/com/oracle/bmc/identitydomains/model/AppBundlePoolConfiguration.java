/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Configurable options maintaining a pool of ICF connector instances. Values for sub attributes can
 * be set only if the ConnectorBundle referenced in the App has connectorPoolingSupported set to
 * true
 *
 * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite -
 * required: false - returned: default - type: complex - uniqueness: none <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AppBundlePoolConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppBundlePoolConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "maxIdle",
        "maxObjects",
        "maxWait",
        "minEvictableIdleTimeMillis",
        "minIdle"
    })
    public AppBundlePoolConfiguration(
            Integer maxIdle,
            Integer maxObjects,
            Integer maxWait,
            Integer minEvictableIdleTimeMillis,
            Integer minIdle) {
        super();
        this.maxIdle = maxIdle;
        this.maxObjects = maxObjects;
        this.maxWait = maxWait;
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
        this.minIdle = minIdle;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Maximum number of connector instances in the pool that are idle and active.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: integer -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxIdle")
        private Integer maxIdle;

        /**
         * Maximum number of connector instances in the pool that are idle and active.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: integer -
         * uniqueness: none
         *
         * @param maxIdle the value to set
         * @return this builder
         */
        public Builder maxIdle(Integer maxIdle) {
            this.maxIdle = maxIdle;
            this.__explicitlySet__.add("maxIdle");
            return this;
        }
        /**
         * Maximum number of connector instances in the pool that are idle and active.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxObjects")
        private Integer maxObjects;

        /**
         * Maximum number of connector instances in the pool that are idle and active.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
         * none
         *
         * @param maxObjects the value to set
         * @return this builder
         */
        public Builder maxObjects(Integer maxObjects) {
            this.maxObjects = maxObjects;
            this.__explicitlySet__.add("maxObjects");
            return this;
        }
        /**
         * Maximum time (in milliseconds) to wait for a free connector instance to become available
         * before failing.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: integer -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxWait")
        private Integer maxWait;

        /**
         * Maximum time (in milliseconds) to wait for a free connector instance to become available
         * before failing.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: integer -
         * uniqueness: none
         *
         * @param maxWait the value to set
         * @return this builder
         */
        public Builder maxWait(Integer maxWait) {
            this.maxWait = maxWait;
            this.__explicitlySet__.add("maxWait");
            return this;
        }
        /**
         * Minimum time (in milliseconds) to wait before evicting an idle conenctor instance from
         * the pool.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: integer -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minEvictableIdleTimeMillis")
        private Integer minEvictableIdleTimeMillis;

        /**
         * Minimum time (in milliseconds) to wait before evicting an idle conenctor instance from
         * the pool.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: integer -
         * uniqueness: none
         *
         * @param minEvictableIdleTimeMillis the value to set
         * @return this builder
         */
        public Builder minEvictableIdleTimeMillis(Integer minEvictableIdleTimeMillis) {
            this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
            this.__explicitlySet__.add("minEvictableIdleTimeMillis");
            return this;
        }
        /**
         * Minimum number of idle connector instances in the pool.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minIdle")
        private Integer minIdle;

        /**
         * Minimum number of idle connector instances in the pool.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
         * none
         *
         * @param minIdle the value to set
         * @return this builder
         */
        public Builder minIdle(Integer minIdle) {
            this.minIdle = minIdle;
            this.__explicitlySet__.add("minIdle");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppBundlePoolConfiguration build() {
            AppBundlePoolConfiguration model =
                    new AppBundlePoolConfiguration(
                            this.maxIdle,
                            this.maxObjects,
                            this.maxWait,
                            this.minEvictableIdleTimeMillis,
                            this.minIdle);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppBundlePoolConfiguration model) {
            if (model.wasPropertyExplicitlySet("maxIdle")) {
                this.maxIdle(model.getMaxIdle());
            }
            if (model.wasPropertyExplicitlySet("maxObjects")) {
                this.maxObjects(model.getMaxObjects());
            }
            if (model.wasPropertyExplicitlySet("maxWait")) {
                this.maxWait(model.getMaxWait());
            }
            if (model.wasPropertyExplicitlySet("minEvictableIdleTimeMillis")) {
                this.minEvictableIdleTimeMillis(model.getMinEvictableIdleTimeMillis());
            }
            if (model.wasPropertyExplicitlySet("minIdle")) {
                this.minIdle(model.getMinIdle());
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
     * Maximum number of connector instances in the pool that are idle and active.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxIdle")
    private final Integer maxIdle;

    /**
     * Maximum number of connector instances in the pool that are idle and active.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     *
     * @return the value
     */
    public Integer getMaxIdle() {
        return maxIdle;
    }

    /**
     * Maximum number of connector instances in the pool that are idle and active.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxObjects")
    private final Integer maxObjects;

    /**
     * Maximum number of connector instances in the pool that are idle and active.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     *
     * @return the value
     */
    public Integer getMaxObjects() {
        return maxObjects;
    }

    /**
     * Maximum time (in milliseconds) to wait for a free connector instance to become available
     * before failing.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxWait")
    private final Integer maxWait;

    /**
     * Maximum time (in milliseconds) to wait for a free connector instance to become available
     * before failing.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     *
     * @return the value
     */
    public Integer getMaxWait() {
        return maxWait;
    }

    /**
     * Minimum time (in milliseconds) to wait before evicting an idle conenctor instance from the
     * pool.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minEvictableIdleTimeMillis")
    private final Integer minEvictableIdleTimeMillis;

    /**
     * Minimum time (in milliseconds) to wait before evicting an idle conenctor instance from the
     * pool.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     *
     * @return the value
     */
    public Integer getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    /**
     * Minimum number of idle connector instances in the pool.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minIdle")
    private final Integer minIdle;

    /**
     * Minimum number of idle connector instances in the pool.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     *
     * @return the value
     */
    public Integer getMinIdle() {
        return minIdle;
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
        sb.append("AppBundlePoolConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("maxIdle=").append(String.valueOf(this.maxIdle));
        sb.append(", maxObjects=").append(String.valueOf(this.maxObjects));
        sb.append(", maxWait=").append(String.valueOf(this.maxWait));
        sb.append(", minEvictableIdleTimeMillis=")
                .append(String.valueOf(this.minEvictableIdleTimeMillis));
        sb.append(", minIdle=").append(String.valueOf(this.minIdle));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppBundlePoolConfiguration)) {
            return false;
        }

        AppBundlePoolConfiguration other = (AppBundlePoolConfiguration) o;
        return java.util.Objects.equals(this.maxIdle, other.maxIdle)
                && java.util.Objects.equals(this.maxObjects, other.maxObjects)
                && java.util.Objects.equals(this.maxWait, other.maxWait)
                && java.util.Objects.equals(
                        this.minEvictableIdleTimeMillis, other.minEvictableIdleTimeMillis)
                && java.util.Objects.equals(this.minIdle, other.minIdle)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.maxIdle == null ? 43 : this.maxIdle.hashCode());
        result = (result * PRIME) + (this.maxObjects == null ? 43 : this.maxObjects.hashCode());
        result = (result * PRIME) + (this.maxWait == null ? 43 : this.maxWait.hashCode());
        result =
                (result * PRIME)
                        + (this.minEvictableIdleTimeMillis == null
                                ? 43
                                : this.minEvictableIdleTimeMillis.hashCode());
        result = (result * PRIME) + (this.minIdle == null ? 43 : this.minIdle.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
