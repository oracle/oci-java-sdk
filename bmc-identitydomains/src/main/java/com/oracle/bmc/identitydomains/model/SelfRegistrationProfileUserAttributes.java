/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * User Attributes <br>
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
        builder = SelfRegistrationProfileUserAttributes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SelfRegistrationProfileUserAttributes
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "value",
        "fullyQualifiedAttributeName",
        "seqNumber",
        "deletable",
        "metadata"
    })
    public SelfRegistrationProfileUserAttributes(
            String value,
            String fullyQualifiedAttributeName,
            Integer seqNumber,
            Boolean deletable,
            String metadata) {
        super();
        this.value = value;
        this.fullyQualifiedAttributeName = fullyQualifiedAttributeName;
        this.seqNumber = seqNumber;
        this.deletable = deletable;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * name of the attribute
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * name of the attribute
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * **SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none Fully
         * Qualified Attribute Name
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fullyQualifiedAttributeName")
        private String fullyQualifiedAttributeName;

        /**
         * **SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none Fully
         * Qualified Attribute Name
         *
         * @param fullyQualifiedAttributeName the value to set
         * @return this builder
         */
        public Builder fullyQualifiedAttributeName(String fullyQualifiedAttributeName) {
            this.fullyQualifiedAttributeName = fullyQualifiedAttributeName;
            this.__explicitlySet__.add("fullyQualifiedAttributeName");
            return this;
        }
        /**
         * **SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: integer - uniqueness: none
         * Sequence Number for the attribute
         */
        @com.fasterxml.jackson.annotation.JsonProperty("seqNumber")
        private Integer seqNumber;

        /**
         * **SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: integer - uniqueness: none
         * Sequence Number for the attribute
         *
         * @param seqNumber the value to set
         * @return this builder
         */
        public Builder seqNumber(Integer seqNumber) {
            this.seqNumber = seqNumber;
            this.__explicitlySet__.add("seqNumber");
            return this;
        }
        /**
         * If this attribute can be deleted
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deletable")
        private Boolean deletable;

        /**
         * If this attribute can be deleted
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param deletable the value to set
         * @return this builder
         */
        public Builder deletable(Boolean deletable) {
            this.deletable = deletable;
            this.__explicitlySet__.add("deletable");
            return this;
        }
        /**
         * Metadata of the user attribute
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private String metadata;

        /**
         * Metadata of the user attribute
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: string - uniqueness: none
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SelfRegistrationProfileUserAttributes build() {
            SelfRegistrationProfileUserAttributes model =
                    new SelfRegistrationProfileUserAttributes(
                            this.value,
                            this.fullyQualifiedAttributeName,
                            this.seqNumber,
                            this.deletable,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SelfRegistrationProfileUserAttributes model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("fullyQualifiedAttributeName")) {
                this.fullyQualifiedAttributeName(model.getFullyQualifiedAttributeName());
            }
            if (model.wasPropertyExplicitlySet("seqNumber")) {
                this.seqNumber(model.getSeqNumber());
            }
            if (model.wasPropertyExplicitlySet("deletable")) {
                this.deletable(model.getDeletable());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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
     * name of the attribute
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * name of the attribute
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * **SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none Fully Qualified
     * Attribute Name
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fullyQualifiedAttributeName")
    private final String fullyQualifiedAttributeName;

    /**
     * **SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none Fully Qualified
     * Attribute Name
     *
     * @return the value
     */
    public String getFullyQualifiedAttributeName() {
        return fullyQualifiedAttributeName;
    }

    /**
     * **SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite -
     * required: true - returned: default - type: integer - uniqueness: none Sequence Number for the
     * attribute
     */
    @com.fasterxml.jackson.annotation.JsonProperty("seqNumber")
    private final Integer seqNumber;

    /**
     * **SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite -
     * required: true - returned: default - type: integer - uniqueness: none Sequence Number for the
     * attribute
     *
     * @return the value
     */
    public Integer getSeqNumber() {
        return seqNumber;
    }

    /**
     * If this attribute can be deleted
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deletable")
    private final Boolean deletable;

    /**
     * If this attribute can be deleted
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getDeletable() {
        return deletable;
    }

    /**
     * Metadata of the user attribute
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final String metadata;

    /**
     * Metadata of the user attribute
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getMetadata() {
        return metadata;
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
        sb.append("SelfRegistrationProfileUserAttributes(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", fullyQualifiedAttributeName=")
                .append(String.valueOf(this.fullyQualifiedAttributeName));
        sb.append(", seqNumber=").append(String.valueOf(this.seqNumber));
        sb.append(", deletable=").append(String.valueOf(this.deletable));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SelfRegistrationProfileUserAttributes)) {
            return false;
        }

        SelfRegistrationProfileUserAttributes other = (SelfRegistrationProfileUserAttributes) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(
                        this.fullyQualifiedAttributeName, other.fullyQualifiedAttributeName)
                && java.util.Objects.equals(this.seqNumber, other.seqNumber)
                && java.util.Objects.equals(this.deletable, other.deletable)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result =
                (result * PRIME)
                        + (this.fullyQualifiedAttributeName == null
                                ? 43
                                : this.fullyQualifiedAttributeName.hashCode());
        result = (result * PRIME) + (this.seqNumber == null ? 43 : this.seqNumber.hashCode());
        result = (result * PRIME) + (this.deletable == null ? 43 : this.deletable.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
