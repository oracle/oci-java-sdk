/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * The self-hosted engine status of this host. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmHostedEngine.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmHostedEngine
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isActive",
        "isConfigured",
        "isGlobalMaintenance",
        "isLocalMaintenance",
        "score"
    })
    public OlvmHostedEngine(
            Boolean isActive,
            Boolean isConfigured,
            Boolean isGlobalMaintenance,
            Boolean isLocalMaintenance,
            Integer score) {
        super();
        this.isActive = isActive;
        this.isConfigured = isConfigured;
        this.isGlobalMaintenance = isGlobalMaintenance;
        this.isLocalMaintenance = isLocalMaintenance;
        this.score = score;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates if this hosted engine is active. */
        @com.fasterxml.jackson.annotation.JsonProperty("isActive")
        private Boolean isActive;

        /**
         * Indicates if this hosted engine is active.
         *
         * @param isActive the value to set
         * @return this builder
         */
        public Builder isActive(Boolean isActive) {
            this.isActive = isActive;
            this.__explicitlySet__.add("isActive");
            return this;
        }
        /** Indicates if this hosted engine is configured. */
        @com.fasterxml.jackson.annotation.JsonProperty("isConfigured")
        private Boolean isConfigured;

        /**
         * Indicates if this hosted engine is configured.
         *
         * @param isConfigured the value to set
         * @return this builder
         */
        public Builder isConfigured(Boolean isConfigured) {
            this.isConfigured = isConfigured;
            this.__explicitlySet__.add("isConfigured");
            return this;
        }
        /** Indicates if this hosted engine under global maintenance. */
        @com.fasterxml.jackson.annotation.JsonProperty("isGlobalMaintenance")
        private Boolean isGlobalMaintenance;

        /**
         * Indicates if this hosted engine under global maintenance.
         *
         * @param isGlobalMaintenance the value to set
         * @return this builder
         */
        public Builder isGlobalMaintenance(Boolean isGlobalMaintenance) {
            this.isGlobalMaintenance = isGlobalMaintenance;
            this.__explicitlySet__.add("isGlobalMaintenance");
            return this;
        }
        /** Indicates if this hosted engine under local maintenance. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLocalMaintenance")
        private Boolean isLocalMaintenance;

        /**
         * Indicates if this hosted engine under local maintenance.
         *
         * @param isLocalMaintenance the value to set
         * @return this builder
         */
        public Builder isLocalMaintenance(Boolean isLocalMaintenance) {
            this.isLocalMaintenance = isLocalMaintenance;
            this.__explicitlySet__.add("isLocalMaintenance");
            return this;
        }
        /** A numerical value representing the health and status of the Manager virtual machine */
        @com.fasterxml.jackson.annotation.JsonProperty("score")
        private Integer score;

        /**
         * A numerical value representing the health and status of the Manager virtual machine
         *
         * @param score the value to set
         * @return this builder
         */
        public Builder score(Integer score) {
            this.score = score;
            this.__explicitlySet__.add("score");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmHostedEngine build() {
            OlvmHostedEngine model =
                    new OlvmHostedEngine(
                            this.isActive,
                            this.isConfigured,
                            this.isGlobalMaintenance,
                            this.isLocalMaintenance,
                            this.score);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmHostedEngine model) {
            if (model.wasPropertyExplicitlySet("isActive")) {
                this.isActive(model.getIsActive());
            }
            if (model.wasPropertyExplicitlySet("isConfigured")) {
                this.isConfigured(model.getIsConfigured());
            }
            if (model.wasPropertyExplicitlySet("isGlobalMaintenance")) {
                this.isGlobalMaintenance(model.getIsGlobalMaintenance());
            }
            if (model.wasPropertyExplicitlySet("isLocalMaintenance")) {
                this.isLocalMaintenance(model.getIsLocalMaintenance());
            }
            if (model.wasPropertyExplicitlySet("score")) {
                this.score(model.getScore());
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

    /** Indicates if this hosted engine is active. */
    @com.fasterxml.jackson.annotation.JsonProperty("isActive")
    private final Boolean isActive;

    /**
     * Indicates if this hosted engine is active.
     *
     * @return the value
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /** Indicates if this hosted engine is configured. */
    @com.fasterxml.jackson.annotation.JsonProperty("isConfigured")
    private final Boolean isConfigured;

    /**
     * Indicates if this hosted engine is configured.
     *
     * @return the value
     */
    public Boolean getIsConfigured() {
        return isConfigured;
    }

    /** Indicates if this hosted engine under global maintenance. */
    @com.fasterxml.jackson.annotation.JsonProperty("isGlobalMaintenance")
    private final Boolean isGlobalMaintenance;

    /**
     * Indicates if this hosted engine under global maintenance.
     *
     * @return the value
     */
    public Boolean getIsGlobalMaintenance() {
        return isGlobalMaintenance;
    }

    /** Indicates if this hosted engine under local maintenance. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLocalMaintenance")
    private final Boolean isLocalMaintenance;

    /**
     * Indicates if this hosted engine under local maintenance.
     *
     * @return the value
     */
    public Boolean getIsLocalMaintenance() {
        return isLocalMaintenance;
    }

    /** A numerical value representing the health and status of the Manager virtual machine */
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    private final Integer score;

    /**
     * A numerical value representing the health and status of the Manager virtual machine
     *
     * @return the value
     */
    public Integer getScore() {
        return score;
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
        sb.append("OlvmHostedEngine(");
        sb.append("super=").append(super.toString());
        sb.append("isActive=").append(String.valueOf(this.isActive));
        sb.append(", isConfigured=").append(String.valueOf(this.isConfigured));
        sb.append(", isGlobalMaintenance=").append(String.valueOf(this.isGlobalMaintenance));
        sb.append(", isLocalMaintenance=").append(String.valueOf(this.isLocalMaintenance));
        sb.append(", score=").append(String.valueOf(this.score));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmHostedEngine)) {
            return false;
        }

        OlvmHostedEngine other = (OlvmHostedEngine) o;
        return java.util.Objects.equals(this.isActive, other.isActive)
                && java.util.Objects.equals(this.isConfigured, other.isConfigured)
                && java.util.Objects.equals(this.isGlobalMaintenance, other.isGlobalMaintenance)
                && java.util.Objects.equals(this.isLocalMaintenance, other.isLocalMaintenance)
                && java.util.Objects.equals(this.score, other.score)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isActive == null ? 43 : this.isActive.hashCode());
        result = (result * PRIME) + (this.isConfigured == null ? 43 : this.isConfigured.hashCode());
        result =
                (result * PRIME)
                        + (this.isGlobalMaintenance == null
                                ? 43
                                : this.isGlobalMaintenance.hashCode());
        result =
                (result * PRIME)
                        + (this.isLocalMaintenance == null
                                ? 43
                                : this.isLocalMaintenance.hashCode());
        result = (result * PRIME) + (this.score == null ? 43 : this.score.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
