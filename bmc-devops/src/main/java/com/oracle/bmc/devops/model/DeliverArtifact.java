/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Artifact information that need to be pushed to the artifactory stores.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DeliverArtifact.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DeliverArtifact {
    @Deprecated
    @java.beans.ConstructorProperties({"artifactName", "artifactId"})
    public DeliverArtifact(String artifactName, String artifactId) {
        super();
        this.artifactName = artifactName;
        this.artifactId = artifactId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("artifactName")
        private String artifactName;

        public Builder artifactName(String artifactName) {
            this.artifactName = artifactName;
            this.__explicitlySet__.add("artifactName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("artifactId")
        private String artifactId;

        public Builder artifactId(String artifactId) {
            this.artifactId = artifactId;
            this.__explicitlySet__.add("artifactId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeliverArtifact build() {
            DeliverArtifact __instance__ = new DeliverArtifact(artifactName, artifactId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeliverArtifact o) {
            Builder copiedBuilder = artifactName(o.getArtifactName()).artifactId(o.getArtifactId());

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
     * Name of the artifact specified in the build_spec.yaml file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("artifactName")
    private final String artifactName;

    public String getArtifactName() {
        return artifactName;
    }

    /**
     * Artifact identifier that contains the artifact definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("artifactId")
    private final String artifactId;

    public String getArtifactId() {
        return artifactId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DeliverArtifact(");
        sb.append("artifactName=").append(String.valueOf(this.artifactName));
        sb.append(", artifactId=").append(String.valueOf(this.artifactId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeliverArtifact)) {
            return false;
        }

        DeliverArtifact other = (DeliverArtifact) o;
        return java.util.Objects.equals(this.artifactName, other.artifactName)
                && java.util.Objects.equals(this.artifactId, other.artifactId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.artifactName == null ? 43 : this.artifactName.hashCode());
        result = (result * PRIME) + (this.artifactId == null ? 43 : this.artifactId.hashCode());
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
