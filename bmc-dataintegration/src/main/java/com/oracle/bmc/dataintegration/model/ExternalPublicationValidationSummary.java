/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The external publication validation summary contains the validation summary information and the
 * definition of the external object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalPublicationValidationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalPublicationValidationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalMessageCount",
        "errorMessageCount",
        "warnMessageCount",
        "infoMessageCount",
        "validationMessages",
        "key"
    })
    public ExternalPublicationValidationSummary(
            Integer totalMessageCount,
            Integer errorMessageCount,
            Integer warnMessageCount,
            Integer infoMessageCount,
            java.util.Map<String, java.util.List<ValidationMessage>> validationMessages,
            String key) {
        super();
        this.totalMessageCount = totalMessageCount;
        this.errorMessageCount = errorMessageCount;
        this.warnMessageCount = warnMessageCount;
        this.infoMessageCount = infoMessageCount;
        this.validationMessages = validationMessages;
        this.key = key;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total number of validation messages. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalMessageCount")
        private Integer totalMessageCount;

        /**
         * Total number of validation messages.
         *
         * @param totalMessageCount the value to set
         * @return this builder
         */
        public Builder totalMessageCount(Integer totalMessageCount) {
            this.totalMessageCount = totalMessageCount;
            this.__explicitlySet__.add("totalMessageCount");
            return this;
        }
        /** Total number of validation error messages. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessageCount")
        private Integer errorMessageCount;

        /**
         * Total number of validation error messages.
         *
         * @param errorMessageCount the value to set
         * @return this builder
         */
        public Builder errorMessageCount(Integer errorMessageCount) {
            this.errorMessageCount = errorMessageCount;
            this.__explicitlySet__.add("errorMessageCount");
            return this;
        }
        /** Total number of validation warning messages. */
        @com.fasterxml.jackson.annotation.JsonProperty("warnMessageCount")
        private Integer warnMessageCount;

        /**
         * Total number of validation warning messages.
         *
         * @param warnMessageCount the value to set
         * @return this builder
         */
        public Builder warnMessageCount(Integer warnMessageCount) {
            this.warnMessageCount = warnMessageCount;
            this.__explicitlySet__.add("warnMessageCount");
            return this;
        }
        /** Total number of validation information messages. */
        @com.fasterxml.jackson.annotation.JsonProperty("infoMessageCount")
        private Integer infoMessageCount;

        /**
         * Total number of validation information messages.
         *
         * @param infoMessageCount the value to set
         * @return this builder
         */
        public Builder infoMessageCount(Integer infoMessageCount) {
            this.infoMessageCount = infoMessageCount;
            this.__explicitlySet__.add("infoMessageCount");
            return this;
        }
        /** Detailed information of the data flow object validation. */
        @com.fasterxml.jackson.annotation.JsonProperty("validationMessages")
        private java.util.Map<String, java.util.List<ValidationMessage>> validationMessages;

        /**
         * Detailed information of the data flow object validation.
         *
         * @param validationMessages the value to set
         * @return this builder
         */
        public Builder validationMessages(
                java.util.Map<String, java.util.List<ValidationMessage>> validationMessages) {
            this.validationMessages = validationMessages;
            this.__explicitlySet__.add("validationMessages");
            return this;
        }
        /**
         * Objects use a 36 character key as unique ID. It is system generated and cannot be
         * modified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Objects use a 36 character key as unique ID. It is system generated and cannot be
         * modified.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalPublicationValidationSummary build() {
            ExternalPublicationValidationSummary model =
                    new ExternalPublicationValidationSummary(
                            this.totalMessageCount,
                            this.errorMessageCount,
                            this.warnMessageCount,
                            this.infoMessageCount,
                            this.validationMessages,
                            this.key);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalPublicationValidationSummary model) {
            if (model.wasPropertyExplicitlySet("totalMessageCount")) {
                this.totalMessageCount(model.getTotalMessageCount());
            }
            if (model.wasPropertyExplicitlySet("errorMessageCount")) {
                this.errorMessageCount(model.getErrorMessageCount());
            }
            if (model.wasPropertyExplicitlySet("warnMessageCount")) {
                this.warnMessageCount(model.getWarnMessageCount());
            }
            if (model.wasPropertyExplicitlySet("infoMessageCount")) {
                this.infoMessageCount(model.getInfoMessageCount());
            }
            if (model.wasPropertyExplicitlySet("validationMessages")) {
                this.validationMessages(model.getValidationMessages());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
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

    /** Total number of validation messages. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalMessageCount")
    private final Integer totalMessageCount;

    /**
     * Total number of validation messages.
     *
     * @return the value
     */
    public Integer getTotalMessageCount() {
        return totalMessageCount;
    }

    /** Total number of validation error messages. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessageCount")
    private final Integer errorMessageCount;

    /**
     * Total number of validation error messages.
     *
     * @return the value
     */
    public Integer getErrorMessageCount() {
        return errorMessageCount;
    }

    /** Total number of validation warning messages. */
    @com.fasterxml.jackson.annotation.JsonProperty("warnMessageCount")
    private final Integer warnMessageCount;

    /**
     * Total number of validation warning messages.
     *
     * @return the value
     */
    public Integer getWarnMessageCount() {
        return warnMessageCount;
    }

    /** Total number of validation information messages. */
    @com.fasterxml.jackson.annotation.JsonProperty("infoMessageCount")
    private final Integer infoMessageCount;

    /**
     * Total number of validation information messages.
     *
     * @return the value
     */
    public Integer getInfoMessageCount() {
        return infoMessageCount;
    }

    /** Detailed information of the data flow object validation. */
    @com.fasterxml.jackson.annotation.JsonProperty("validationMessages")
    private final java.util.Map<String, java.util.List<ValidationMessage>> validationMessages;

    /**
     * Detailed information of the data flow object validation.
     *
     * @return the value
     */
    public java.util.Map<String, java.util.List<ValidationMessage>> getValidationMessages() {
        return validationMessages;
    }

    /**
     * Objects use a 36 character key as unique ID. It is system generated and cannot be modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Objects use a 36 character key as unique ID. It is system generated and cannot be modified.
     *
     * @return the value
     */
    public String getKey() {
        return key;
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
        sb.append("ExternalPublicationValidationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("totalMessageCount=").append(String.valueOf(this.totalMessageCount));
        sb.append(", errorMessageCount=").append(String.valueOf(this.errorMessageCount));
        sb.append(", warnMessageCount=").append(String.valueOf(this.warnMessageCount));
        sb.append(", infoMessageCount=").append(String.valueOf(this.infoMessageCount));
        sb.append(", validationMessages=").append(String.valueOf(this.validationMessages));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalPublicationValidationSummary)) {
            return false;
        }

        ExternalPublicationValidationSummary other = (ExternalPublicationValidationSummary) o;
        return java.util.Objects.equals(this.totalMessageCount, other.totalMessageCount)
                && java.util.Objects.equals(this.errorMessageCount, other.errorMessageCount)
                && java.util.Objects.equals(this.warnMessageCount, other.warnMessageCount)
                && java.util.Objects.equals(this.infoMessageCount, other.infoMessageCount)
                && java.util.Objects.equals(this.validationMessages, other.validationMessages)
                && java.util.Objects.equals(this.key, other.key)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalMessageCount == null ? 43 : this.totalMessageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.errorMessageCount == null ? 43 : this.errorMessageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.warnMessageCount == null ? 43 : this.warnMessageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.infoMessageCount == null ? 43 : this.infoMessageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.validationMessages == null
                                ? 43
                                : this.validationMessages.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
