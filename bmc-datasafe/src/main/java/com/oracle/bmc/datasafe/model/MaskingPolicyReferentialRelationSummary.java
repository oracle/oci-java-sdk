/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A referential relation is a resource corresponding to database columns. It is always associated
 * with a masking policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MaskingPolicyReferentialRelationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MaskingPolicyReferentialRelationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "maskingPolicyId",
        "relationType",
        "parent",
        "child",
        "maskingFormat"
    })
    public MaskingPolicyReferentialRelationSummary(
            String maskingPolicyId,
            RelationType relationType,
            MaskingPolicyColumnsInfo parent,
            MaskingPolicyColumnsInfo child,
            java.util.List<String> maskingFormat) {
        super();
        this.maskingPolicyId = maskingPolicyId;
        this.relationType = relationType;
        this.parent = parent;
        this.child = child;
        this.maskingFormat = maskingFormat;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the masking policy that contains the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
        private String maskingPolicyId;

        /**
         * The OCID of the masking policy that contains the column.
         *
         * @param maskingPolicyId the value to set
         * @return this builder
         */
        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = maskingPolicyId;
            this.__explicitlySet__.add("maskingPolicyId");
            return this;
        }
        /**
         * The type of referential relationship the column has with its parent. DB_DEFINED indicates
         * that the relationship is defined in the database dictionary. APP_DEFINED indicates that
         * the relationship is defined at the application level and not in the database dictionary.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("relationType")
        private RelationType relationType;

        /**
         * The type of referential relationship the column has with its parent. DB_DEFINED indicates
         * that the relationship is defined in the database dictionary. APP_DEFINED indicates that
         * the relationship is defined at the application level and not in the database dictionary.
         *
         * @param relationType the value to set
         * @return this builder
         */
        public Builder relationType(RelationType relationType) {
            this.relationType = relationType;
            this.__explicitlySet__.add("relationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parent")
        private MaskingPolicyColumnsInfo parent;

        public Builder parent(MaskingPolicyColumnsInfo parent) {
            this.parent = parent;
            this.__explicitlySet__.add("parent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("child")
        private MaskingPolicyColumnsInfo child;

        public Builder child(MaskingPolicyColumnsInfo child) {
            this.child = child;
            this.__explicitlySet__.add("child");
            return this;
        }
        /** The masking format associated with the parent column. */
        @com.fasterxml.jackson.annotation.JsonProperty("maskingFormat")
        private java.util.List<String> maskingFormat;

        /**
         * The masking format associated with the parent column.
         *
         * @param maskingFormat the value to set
         * @return this builder
         */
        public Builder maskingFormat(java.util.List<String> maskingFormat) {
            this.maskingFormat = maskingFormat;
            this.__explicitlySet__.add("maskingFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaskingPolicyReferentialRelationSummary build() {
            MaskingPolicyReferentialRelationSummary model =
                    new MaskingPolicyReferentialRelationSummary(
                            this.maskingPolicyId,
                            this.relationType,
                            this.parent,
                            this.child,
                            this.maskingFormat);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaskingPolicyReferentialRelationSummary model) {
            if (model.wasPropertyExplicitlySet("maskingPolicyId")) {
                this.maskingPolicyId(model.getMaskingPolicyId());
            }
            if (model.wasPropertyExplicitlySet("relationType")) {
                this.relationType(model.getRelationType());
            }
            if (model.wasPropertyExplicitlySet("parent")) {
                this.parent(model.getParent());
            }
            if (model.wasPropertyExplicitlySet("child")) {
                this.child(model.getChild());
            }
            if (model.wasPropertyExplicitlySet("maskingFormat")) {
                this.maskingFormat(model.getMaskingFormat());
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

    /** The OCID of the masking policy that contains the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
    private final String maskingPolicyId;

    /**
     * The OCID of the masking policy that contains the column.
     *
     * @return the value
     */
    public String getMaskingPolicyId() {
        return maskingPolicyId;
    }

    /**
     * The type of referential relationship the column has with its parent. DB_DEFINED indicates
     * that the relationship is defined in the database dictionary. APP_DEFINED indicates that the
     * relationship is defined at the application level and not in the database dictionary.
     */
    public enum RelationType implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        AppDefined("APP_DEFINED"),
        DbDefined("DB_DEFINED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RelationType.class);

        private final String value;
        private static java.util.Map<String, RelationType> map;

        static {
            map = new java.util.HashMap<>();
            for (RelationType v : RelationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RelationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RelationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RelationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of referential relationship the column has with its parent. DB_DEFINED indicates
     * that the relationship is defined in the database dictionary. APP_DEFINED indicates that the
     * relationship is defined at the application level and not in the database dictionary.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relationType")
    private final RelationType relationType;

    /**
     * The type of referential relationship the column has with its parent. DB_DEFINED indicates
     * that the relationship is defined in the database dictionary. APP_DEFINED indicates that the
     * relationship is defined at the application level and not in the database dictionary.
     *
     * @return the value
     */
    public RelationType getRelationType() {
        return relationType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parent")
    private final MaskingPolicyColumnsInfo parent;

    public MaskingPolicyColumnsInfo getParent() {
        return parent;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("child")
    private final MaskingPolicyColumnsInfo child;

    public MaskingPolicyColumnsInfo getChild() {
        return child;
    }

    /** The masking format associated with the parent column. */
    @com.fasterxml.jackson.annotation.JsonProperty("maskingFormat")
    private final java.util.List<String> maskingFormat;

    /**
     * The masking format associated with the parent column.
     *
     * @return the value
     */
    public java.util.List<String> getMaskingFormat() {
        return maskingFormat;
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
        sb.append("MaskingPolicyReferentialRelationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("maskingPolicyId=").append(String.valueOf(this.maskingPolicyId));
        sb.append(", relationType=").append(String.valueOf(this.relationType));
        sb.append(", parent=").append(String.valueOf(this.parent));
        sb.append(", child=").append(String.valueOf(this.child));
        sb.append(", maskingFormat=").append(String.valueOf(this.maskingFormat));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaskingPolicyReferentialRelationSummary)) {
            return false;
        }

        MaskingPolicyReferentialRelationSummary other = (MaskingPolicyReferentialRelationSummary) o;
        return java.util.Objects.equals(this.maskingPolicyId, other.maskingPolicyId)
                && java.util.Objects.equals(this.relationType, other.relationType)
                && java.util.Objects.equals(this.parent, other.parent)
                && java.util.Objects.equals(this.child, other.child)
                && java.util.Objects.equals(this.maskingFormat, other.maskingFormat)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.maskingPolicyId == null ? 43 : this.maskingPolicyId.hashCode());
        result = (result * PRIME) + (this.relationType == null ? 43 : this.relationType.hashCode());
        result = (result * PRIME) + (this.parent == null ? 43 : this.parent.hashCode());
        result = (result * PRIME) + (this.child == null ? 43 : this.child.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingFormat == null ? 43 : this.maskingFormat.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
