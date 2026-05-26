/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * A single precheck result. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DisasterRecoveryPrecheckResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DisasterRecoveryPrecheckResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "description",
        "correctiveAction",
        "status",
        "relatedResourceId",
        "relatedResourceType",
        "code"
    })
    public DisasterRecoveryPrecheckResult(
            String key,
            String displayName,
            String description,
            String correctiveAction,
            PrecheckStatus status,
            String relatedResourceId,
            RelatedResourceType relatedResourceType,
            String code) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.correctiveAction = correctiveAction;
        this.status = status;
        this.relatedResourceId = relatedResourceId;
        this.relatedResourceType = relatedResourceType;
        this.code = code;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** UUID to uniquely identify the each check result. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * UUID to uniquely identify the each check result.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** An object's Display Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An object's Display Name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Metadata about this specific object. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Metadata about this specific object.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The corrective action for non-passing checks. Null for passed checks. */
        @com.fasterxml.jackson.annotation.JsonProperty("correctiveAction")
        private String correctiveAction;

        /**
         * The corrective action for non-passing checks. Null for passed checks.
         *
         * @param correctiveAction the value to set
         * @return this builder
         */
        public Builder correctiveAction(String correctiveAction) {
            this.correctiveAction = correctiveAction;
            this.__explicitlySet__.add("correctiveAction");
            return this;
        }
        /** Status of the DR precheck result. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private PrecheckStatus status;

        /**
         * Status of the DR precheck result.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(PrecheckStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * resource related to the corresponding check.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("relatedResourceId")
        private String relatedResourceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * resource related to the corresponding check.
         *
         * @param relatedResourceId the value to set
         * @return this builder
         */
        public Builder relatedResourceId(String relatedResourceId) {
            this.relatedResourceId = relatedResourceId;
            this.__explicitlySet__.add("relatedResourceId");
            return this;
        }
        /** Type of resource related to corresponding check. */
        @com.fasterxml.jackson.annotation.JsonProperty("relatedResourceType")
        private RelatedResourceType relatedResourceType;

        /**
         * Type of resource related to corresponding check.
         *
         * @param relatedResourceType the value to set
         * @return this builder
         */
        public Builder relatedResourceType(RelatedResourceType relatedResourceType) {
            this.relatedResourceType = relatedResourceType;
            this.__explicitlySet__.add("relatedResourceType");
            return this;
        }
        /**
         * The code returned when GoldenGate reports an error while running a step during pipeline
         * initialization.
         * https://docs.oracle.com/en/middleware/goldengate/core/23/error-messages/ogg-00001-ogg-40000.html#GUID-97FF7AA7-7A5C-4AA7-B29F-3CC8D26761F2
         */
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private String code;

        /**
         * The code returned when GoldenGate reports an error while running a step during pipeline
         * initialization.
         * https://docs.oracle.com/en/middleware/goldengate/core/23/error-messages/ogg-00001-ogg-40000.html#GUID-97FF7AA7-7A5C-4AA7-B29F-3CC8D26761F2
         *
         * @param code the value to set
         * @return this builder
         */
        public Builder code(String code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DisasterRecoveryPrecheckResult build() {
            DisasterRecoveryPrecheckResult model =
                    new DisasterRecoveryPrecheckResult(
                            this.key,
                            this.displayName,
                            this.description,
                            this.correctiveAction,
                            this.status,
                            this.relatedResourceId,
                            this.relatedResourceType,
                            this.code);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DisasterRecoveryPrecheckResult model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("correctiveAction")) {
                this.correctiveAction(model.getCorrectiveAction());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("relatedResourceId")) {
                this.relatedResourceId(model.getRelatedResourceId());
            }
            if (model.wasPropertyExplicitlySet("relatedResourceType")) {
                this.relatedResourceType(model.getRelatedResourceType());
            }
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
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

    /** UUID to uniquely identify the each check result. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * UUID to uniquely identify the each check result.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** An object's Display Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Metadata about this specific object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Metadata about this specific object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The corrective action for non-passing checks. Null for passed checks. */
    @com.fasterxml.jackson.annotation.JsonProperty("correctiveAction")
    private final String correctiveAction;

    /**
     * The corrective action for non-passing checks. Null for passed checks.
     *
     * @return the value
     */
    public String getCorrectiveAction() {
        return correctiveAction;
    }

    /** Status of the DR precheck result. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final PrecheckStatus status;

    /**
     * Status of the DR precheck result.
     *
     * @return the value
     */
    public PrecheckStatus getStatus() {
        return status;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * resource related to the corresponding check.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedResourceId")
    private final String relatedResourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * resource related to the corresponding check.
     *
     * @return the value
     */
    public String getRelatedResourceId() {
        return relatedResourceId;
    }

    /** Type of resource related to corresponding check. */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedResourceType")
    private final RelatedResourceType relatedResourceType;

    /**
     * Type of resource related to corresponding check.
     *
     * @return the value
     */
    public RelatedResourceType getRelatedResourceType() {
        return relatedResourceType;
    }

    /**
     * The code returned when GoldenGate reports an error while running a step during pipeline
     * initialization.
     * https://docs.oracle.com/en/middleware/goldengate/core/23/error-messages/ogg-00001-ogg-40000.html#GUID-97FF7AA7-7A5C-4AA7-B29F-3CC8D26761F2
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

    /**
     * The code returned when GoldenGate reports an error while running a step during pipeline
     * initialization.
     * https://docs.oracle.com/en/middleware/goldengate/core/23/error-messages/ogg-00001-ogg-40000.html#GUID-97FF7AA7-7A5C-4AA7-B29F-3CC8D26761F2
     *
     * @return the value
     */
    public String getCode() {
        return code;
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
        sb.append("DisasterRecoveryPrecheckResult(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", correctiveAction=").append(String.valueOf(this.correctiveAction));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", relatedResourceId=").append(String.valueOf(this.relatedResourceId));
        sb.append(", relatedResourceType=").append(String.valueOf(this.relatedResourceType));
        sb.append(", code=").append(String.valueOf(this.code));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DisasterRecoveryPrecheckResult)) {
            return false;
        }

        DisasterRecoveryPrecheckResult other = (DisasterRecoveryPrecheckResult) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.correctiveAction, other.correctiveAction)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.relatedResourceId, other.relatedResourceId)
                && java.util.Objects.equals(this.relatedResourceType, other.relatedResourceType)
                && java.util.Objects.equals(this.code, other.code)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.correctiveAction == null ? 43 : this.correctiveAction.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedResourceId == null ? 43 : this.relatedResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedResourceType == null
                                ? 43
                                : this.relatedResourceType.hashCode());
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
