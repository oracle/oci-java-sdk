/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Application template on which the application is based.
 *
 * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: immutable -
 * required: true - returned: default - type: complex <br>
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
        builder = AppBasedOnTemplate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppBasedOnTemplate
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "ref", "lastModified", "wellKnownId"})
    public AppBasedOnTemplate(String value, String ref, String lastModified, String wellKnownId) {
        super();
        this.value = value;
        this.ref = ref;
        this.lastModified = lastModified;
        this.wellKnownId = wellKnownId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Identifier of the application template.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: true - returned: always - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Identifier of the application template.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: true - returned: always - type: string - uniqueness:
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
         * URI of the application template.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: reference - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * URI of the application template.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: reference - uniqueness: none
         *
         * @param ref the value to set
         * @return this builder
         */
        public Builder ref(String ref) {
            this.ref = ref;
            this.__explicitlySet__.add("ref");
            return this;
        }
        /**
         * The most recent DateTime that the appTemplate on which the application based upon is
         * updated. The attribute MUST be a DateTime.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: dateTime - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastModified")
        private String lastModified;

        /**
         * The most recent DateTime that the appTemplate on which the application based upon is
         * updated. The attribute MUST be a DateTime.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: dateTime - uniqueness:
         * none
         *
         * @param lastModified the value to set
         * @return this builder
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            this.__explicitlySet__.add("lastModified");
            return this;
        }
        /**
         * Unique Well-known identifier used to reference app template.
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("wellKnownId")
        private String wellKnownId;

        /**
         * Unique Well-known identifier used to reference app template.
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param wellKnownId the value to set
         * @return this builder
         */
        public Builder wellKnownId(String wellKnownId) {
            this.wellKnownId = wellKnownId;
            this.__explicitlySet__.add("wellKnownId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppBasedOnTemplate build() {
            AppBasedOnTemplate model =
                    new AppBasedOnTemplate(
                            this.value, this.ref, this.lastModified, this.wellKnownId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppBasedOnTemplate model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("lastModified")) {
                this.lastModified(model.getLastModified());
            }
            if (model.wasPropertyExplicitlySet("wellKnownId")) {
                this.wellKnownId(model.getWellKnownId());
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
     * Identifier of the application template.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: true - returned: always - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Identifier of the application template.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: true - returned: always - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * URI of the application template.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: reference - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * URI of the application template.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: reference - uniqueness: none
     *
     * @return the value
     */
    public String getRef() {
        return ref;
    }

    /**
     * The most recent DateTime that the appTemplate on which the application based upon is updated.
     * The attribute MUST be a DateTime.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: dateTime - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastModified")
    private final String lastModified;

    /**
     * The most recent DateTime that the appTemplate on which the application based upon is updated.
     * The attribute MUST be a DateTime.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: dateTime - uniqueness:
     * none
     *
     * @return the value
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * Unique Well-known identifier used to reference app template.
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("wellKnownId")
    private final String wellKnownId;

    /**
     * Unique Well-known identifier used to reference app template.
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getWellKnownId() {
        return wellKnownId;
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
        sb.append("AppBasedOnTemplate(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", lastModified=").append(String.valueOf(this.lastModified));
        sb.append(", wellKnownId=").append(String.valueOf(this.wellKnownId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppBasedOnTemplate)) {
            return false;
        }

        AppBasedOnTemplate other = (AppBasedOnTemplate) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.lastModified, other.lastModified)
                && java.util.Objects.equals(this.wellKnownId, other.wellKnownId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.lastModified == null ? 43 : this.lastModified.hashCode());
        result = (result * PRIME) + (this.wellKnownId == null ? 43 : this.wellKnownId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
