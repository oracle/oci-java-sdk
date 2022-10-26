/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The API key summary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BdsApiKeySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class BdsApiKeySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "keyAlias",
        "lifecycleState",
        "defaultRegion",
        "timeCreated"
    })
    public BdsApiKeySummary(
            String id,
            String keyAlias,
            BdsApiKey.LifecycleState lifecycleState,
            String defaultRegion,
            java.util.Date timeCreated) {
        super();
        this.id = id;
        this.keyAlias = keyAlias;
        this.lifecycleState = lifecycleState;
        this.defaultRegion = defaultRegion;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Identifier of the user's API key. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Identifier of the user's API key.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * User friendly identifier used to uniquely differentiate between different API keys. Only
         * ASCII alphanumeric characters with no spaces allowed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyAlias")
        private String keyAlias;

        /**
         * User friendly identifier used to uniquely differentiate between different API keys. Only
         * ASCII alphanumeric characters with no spaces allowed.
         *
         * @param keyAlias the value to set
         * @return this builder
         */
        public Builder keyAlias(String keyAlias) {
            this.keyAlias = keyAlias;
            this.__explicitlySet__.add("keyAlias");
            return this;
        }
        /** The current status of the API key. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private BdsApiKey.LifecycleState lifecycleState;

        /**
         * The current status of the API key.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(BdsApiKey.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The name of the region to establish the Object Storage endpoint which was set as part of
         * key creation operation. If no region was provided this will be set to be the same region
         * where the cluster lives. Example us-phoenix-1 .
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultRegion")
        private String defaultRegion;

        /**
         * The name of the region to establish the Object Storage endpoint which was set as part of
         * key creation operation. If no region was provided this will be set to be the same region
         * where the cluster lives. Example us-phoenix-1 .
         *
         * @param defaultRegion the value to set
         * @return this builder
         */
        public Builder defaultRegion(String defaultRegion) {
            this.defaultRegion = defaultRegion;
            this.__explicitlySet__.add("defaultRegion");
            return this;
        }
        /** The time the API key was created, shown as an RFC 3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the API key was created, shown as an RFC 3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BdsApiKeySummary build() {
            BdsApiKeySummary model =
                    new BdsApiKeySummary(
                            this.id,
                            this.keyAlias,
                            this.lifecycleState,
                            this.defaultRegion,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BdsApiKeySummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("keyAlias")) {
                this.keyAlias(model.getKeyAlias());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("defaultRegion")) {
                this.defaultRegion(model.getDefaultRegion());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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

    /** Identifier of the user's API key. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Identifier of the user's API key.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * User friendly identifier used to uniquely differentiate between different API keys. Only
     * ASCII alphanumeric characters with no spaces allowed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyAlias")
    private final String keyAlias;

    /**
     * User friendly identifier used to uniquely differentiate between different API keys. Only
     * ASCII alphanumeric characters with no spaces allowed.
     *
     * @return the value
     */
    public String getKeyAlias() {
        return keyAlias;
    }

    /** The current status of the API key. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final BdsApiKey.LifecycleState lifecycleState;

    /**
     * The current status of the API key.
     *
     * @return the value
     */
    public BdsApiKey.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The name of the region to establish the Object Storage endpoint which was set as part of key
     * creation operation. If no region was provided this will be set to be the same region where
     * the cluster lives. Example us-phoenix-1 .
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultRegion")
    private final String defaultRegion;

    /**
     * The name of the region to establish the Object Storage endpoint which was set as part of key
     * creation operation. If no region was provided this will be set to be the same region where
     * the cluster lives. Example us-phoenix-1 .
     *
     * @return the value
     */
    public String getDefaultRegion() {
        return defaultRegion;
    }

    /** The time the API key was created, shown as an RFC 3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the API key was created, shown as an RFC 3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("BdsApiKeySummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", keyAlias=").append(String.valueOf(this.keyAlias));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", defaultRegion=").append(String.valueOf(this.defaultRegion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BdsApiKeySummary)) {
            return false;
        }

        BdsApiKeySummary other = (BdsApiKeySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.keyAlias, other.keyAlias)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.defaultRegion, other.defaultRegion)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.keyAlias == null ? 43 : this.keyAlias.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultRegion == null ? 43 : this.defaultRegion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
