/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Configuration information for mirroring the repository.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MirrorRepositoryConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MirrorRepositoryConfig
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"connectorId", "repositoryUrl", "triggerSchedule"})
    public MirrorRepositoryConfig(
            String connectorId, String repositoryUrl, TriggerSchedule triggerSchedule) {
        super();
        this.connectorId = connectorId;
        this.repositoryUrl = repositoryUrl;
        this.triggerSchedule = triggerSchedule;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Upstream git repository connection identifer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
        private String connectorId;

        /**
         * Upstream git repository connection identifer.
         * @param connectorId the value to set
         * @return this builder
         **/
        public Builder connectorId(String connectorId) {
            this.connectorId = connectorId;
            this.__explicitlySet__.add("connectorId");
            return this;
        }
        /**
         * URL of external repository you want to mirror.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
        private String repositoryUrl;

        /**
         * URL of external repository you want to mirror.
         * @param repositoryUrl the value to set
         * @return this builder
         **/
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            this.__explicitlySet__.add("repositoryUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("triggerSchedule")
        private TriggerSchedule triggerSchedule;

        public Builder triggerSchedule(TriggerSchedule triggerSchedule) {
            this.triggerSchedule = triggerSchedule;
            this.__explicitlySet__.add("triggerSchedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MirrorRepositoryConfig build() {
            MirrorRepositoryConfig model =
                    new MirrorRepositoryConfig(
                            this.connectorId, this.repositoryUrl, this.triggerSchedule);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MirrorRepositoryConfig model) {
            if (model.wasPropertyExplicitlySet("connectorId")) {
                this.connectorId(model.getConnectorId());
            }
            if (model.wasPropertyExplicitlySet("repositoryUrl")) {
                this.repositoryUrl(model.getRepositoryUrl());
            }
            if (model.wasPropertyExplicitlySet("triggerSchedule")) {
                this.triggerSchedule(model.getTriggerSchedule());
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
     * Upstream git repository connection identifer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
    private final String connectorId;

    /**
     * Upstream git repository connection identifer.
     * @return the value
     **/
    public String getConnectorId() {
        return connectorId;
    }

    /**
     * URL of external repository you want to mirror.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
    private final String repositoryUrl;

    /**
     * URL of external repository you want to mirror.
     * @return the value
     **/
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("triggerSchedule")
    private final TriggerSchedule triggerSchedule;

    public TriggerSchedule getTriggerSchedule() {
        return triggerSchedule;
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
        sb.append("MirrorRepositoryConfig(");
        sb.append("super=").append(super.toString());
        sb.append("connectorId=").append(String.valueOf(this.connectorId));
        sb.append(", repositoryUrl=").append(String.valueOf(this.repositoryUrl));
        sb.append(", triggerSchedule=").append(String.valueOf(this.triggerSchedule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MirrorRepositoryConfig)) {
            return false;
        }

        MirrorRepositoryConfig other = (MirrorRepositoryConfig) o;
        return java.util.Objects.equals(this.connectorId, other.connectorId)
                && java.util.Objects.equals(this.repositoryUrl, other.repositoryUrl)
                && java.util.Objects.equals(this.triggerSchedule, other.triggerSchedule)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.connectorId == null ? 43 : this.connectorId.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryUrl == null ? 43 : this.repositoryUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.triggerSchedule == null ? 43 : this.triggerSchedule.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
