/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the issue type associated with the support ticket. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IssueType.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IssueType extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"issueTypeKey", "label", "name"})
    public IssueType(String issueTypeKey, String label, String name) {
        super();
        this.issueTypeKey = issueTypeKey;
        this.label = label;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for the issue type. */
        @com.fasterxml.jackson.annotation.JsonProperty("issueTypeKey")
        private String issueTypeKey;

        /**
         * Unique identifier for the issue type.
         *
         * @param issueTypeKey the value to set
         * @return this builder
         */
        public Builder issueTypeKey(String issueTypeKey) {
            this.issueTypeKey = issueTypeKey;
            this.__explicitlySet__.add("issueTypeKey");
            return this;
        }
        /** The label for the issue type. For example, {@code Instance Performance}. */
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * The label for the issue type. For example, {@code Instance Performance}.
         *
         * @param label the value to set
         * @return this builder
         */
        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }
        /** The URL for the contextual documentation. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The URL for the contextual documentation.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IssueType build() {
            IssueType model = new IssueType(this.issueTypeKey, this.label, this.name);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IssueType model) {
            if (model.wasPropertyExplicitlySet("issueTypeKey")) {
                this.issueTypeKey(model.getIssueTypeKey());
            }
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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

    /** Unique identifier for the issue type. */
    @com.fasterxml.jackson.annotation.JsonProperty("issueTypeKey")
    private final String issueTypeKey;

    /**
     * Unique identifier for the issue type.
     *
     * @return the value
     */
    public String getIssueTypeKey() {
        return issueTypeKey;
    }

    /** The label for the issue type. For example, {@code Instance Performance}. */
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * The label for the issue type. For example, {@code Instance Performance}.
     *
     * @return the value
     */
    public String getLabel() {
        return label;
    }

    /** The URL for the contextual documentation. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The URL for the contextual documentation.
     *
     * @return the value
     */
    public String getName() {
        return name;
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
        sb.append("IssueType(");
        sb.append("super=").append(super.toString());
        sb.append("issueTypeKey=").append(String.valueOf(this.issueTypeKey));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IssueType)) {
            return false;
        }

        IssueType other = (IssueType) o;
        return java.util.Objects.equals(this.issueTypeKey, other.issueTypeKey)
                && java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.name, other.name)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.issueTypeKey == null ? 43 : this.issueTypeKey.hashCode());
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
