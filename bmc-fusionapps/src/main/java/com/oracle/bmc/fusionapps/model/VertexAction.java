/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Vertex update action <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VertexAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "actionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class VertexAction extends Action {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("referenceKey")
        private String referenceKey;

        public Builder referenceKey(String referenceKey) {
            this.referenceKey = referenceKey;
            this.__explicitlySet__.add("referenceKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** patch that delivered the vertex update prerequisite */
        @com.fasterxml.jackson.annotation.JsonProperty("artifact")
        private String artifact;

        /**
         * patch that delivered the vertex update prerequisite
         *
         * @param artifact the value to set
         * @return this builder
         */
        public Builder artifact(String artifact) {
            this.artifact = artifact;
            this.__explicitlySet__.add("artifact");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VertexAction build() {
            VertexAction model =
                    new VertexAction(
                            this.referenceKey, this.state, this.description, this.artifact);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VertexAction model) {
            if (model.wasPropertyExplicitlySet("referenceKey")) {
                this.referenceKey(model.getReferenceKey());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("artifact")) {
                this.artifact(model.getArtifact());
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

    @Deprecated
    public VertexAction(String referenceKey, State state, String description, String artifact) {
        super(referenceKey, state, description);
        this.artifact = artifact;
    }

    /** patch that delivered the vertex update prerequisite */
    @com.fasterxml.jackson.annotation.JsonProperty("artifact")
    private final String artifact;

    /**
     * patch that delivered the vertex update prerequisite
     *
     * @return the value
     */
    public String getArtifact() {
        return artifact;
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
        sb.append("VertexAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", artifact=").append(String.valueOf(this.artifact));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VertexAction)) {
            return false;
        }

        VertexAction other = (VertexAction) o;
        return java.util.Objects.equals(this.artifact, other.artifact) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.artifact == null ? 43 : this.artifact.hashCode());
        return result;
    }
}
