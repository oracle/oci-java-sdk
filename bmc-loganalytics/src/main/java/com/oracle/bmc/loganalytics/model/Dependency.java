/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Details of a dependency an object or feature defines on another. For example, a source may depend
 * on a parser either directly or indirectly. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Dependency.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Dependency extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "type",
        "referenceType",
        "referenceId",
        "referenceName",
        "referenceDisplayName"
    })
    public Dependency(
            String type,
            String referenceType,
            Long referenceId,
            String referenceName,
            String referenceDisplayName) {
        super();
        this.type = type;
        this.referenceType = referenceType;
        this.referenceId = referenceId;
        this.referenceName = referenceName;
        this.referenceDisplayName = referenceDisplayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The dependency type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The dependency type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The type of reference that defines the dependency. */
        @com.fasterxml.jackson.annotation.JsonProperty("referenceType")
        private String referenceType;

        /**
         * The type of reference that defines the dependency.
         *
         * @param referenceType the value to set
         * @return this builder
         */
        public Builder referenceType(String referenceType) {
            this.referenceType = referenceType;
            this.__explicitlySet__.add("referenceType");
            return this;
        }
        /** The unique identifier of the reference, if available. */
        @com.fasterxml.jackson.annotation.JsonProperty("referenceId")
        private Long referenceId;

        /**
         * The unique identifier of the reference, if available.
         *
         * @param referenceId the value to set
         * @return this builder
         */
        public Builder referenceId(Long referenceId) {
            this.referenceId = referenceId;
            this.__explicitlySet__.add("referenceId");
            return this;
        }
        /** The name of the dependency object */
        @com.fasterxml.jackson.annotation.JsonProperty("referenceName")
        private String referenceName;

        /**
         * The name of the dependency object
         *
         * @param referenceName the value to set
         * @return this builder
         */
        public Builder referenceName(String referenceName) {
            this.referenceName = referenceName;
            this.__explicitlySet__.add("referenceName");
            return this;
        }
        /** The display name of the dependency object */
        @com.fasterxml.jackson.annotation.JsonProperty("referenceDisplayName")
        private String referenceDisplayName;

        /**
         * The display name of the dependency object
         *
         * @param referenceDisplayName the value to set
         * @return this builder
         */
        public Builder referenceDisplayName(String referenceDisplayName) {
            this.referenceDisplayName = referenceDisplayName;
            this.__explicitlySet__.add("referenceDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Dependency build() {
            Dependency model =
                    new Dependency(
                            this.type,
                            this.referenceType,
                            this.referenceId,
                            this.referenceName,
                            this.referenceDisplayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Dependency model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("referenceType")) {
                this.referenceType(model.getReferenceType());
            }
            if (model.wasPropertyExplicitlySet("referenceId")) {
                this.referenceId(model.getReferenceId());
            }
            if (model.wasPropertyExplicitlySet("referenceName")) {
                this.referenceName(model.getReferenceName());
            }
            if (model.wasPropertyExplicitlySet("referenceDisplayName")) {
                this.referenceDisplayName(model.getReferenceDisplayName());
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

    /** The dependency type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The dependency type.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** The type of reference that defines the dependency. */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceType")
    private final String referenceType;

    /**
     * The type of reference that defines the dependency.
     *
     * @return the value
     */
    public String getReferenceType() {
        return referenceType;
    }

    /** The unique identifier of the reference, if available. */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceId")
    private final Long referenceId;

    /**
     * The unique identifier of the reference, if available.
     *
     * @return the value
     */
    public Long getReferenceId() {
        return referenceId;
    }

    /** The name of the dependency object */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceName")
    private final String referenceName;

    /**
     * The name of the dependency object
     *
     * @return the value
     */
    public String getReferenceName() {
        return referenceName;
    }

    /** The display name of the dependency object */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceDisplayName")
    private final String referenceDisplayName;

    /**
     * The display name of the dependency object
     *
     * @return the value
     */
    public String getReferenceDisplayName() {
        return referenceDisplayName;
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
        sb.append("Dependency(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", referenceType=").append(String.valueOf(this.referenceType));
        sb.append(", referenceId=").append(String.valueOf(this.referenceId));
        sb.append(", referenceName=").append(String.valueOf(this.referenceName));
        sb.append(", referenceDisplayName=").append(String.valueOf(this.referenceDisplayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Dependency)) {
            return false;
        }

        Dependency other = (Dependency) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.referenceType, other.referenceType)
                && java.util.Objects.equals(this.referenceId, other.referenceId)
                && java.util.Objects.equals(this.referenceName, other.referenceName)
                && java.util.Objects.equals(this.referenceDisplayName, other.referenceDisplayName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.referenceType == null ? 43 : this.referenceType.hashCode());
        result = (result * PRIME) + (this.referenceId == null ? 43 : this.referenceId.hashCode());
        result =
                (result * PRIME)
                        + (this.referenceName == null ? 43 : this.referenceName.hashCode());
        result =
                (result * PRIME)
                        + (this.referenceDisplayName == null
                                ? 43
                                : this.referenceDisplayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
