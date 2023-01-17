/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * DNS record data with metadata for processing in a steering policy.
 * <p>
 *
 * **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SteeringPolicyAnswer.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SteeringPolicyAnswer extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "rtype", "rdata", "pool", "isDisabled"})
    public SteeringPolicyAnswer(
            String name, String rtype, String rdata, String pool, Boolean isDisabled) {
        super();
        this.name = name;
        this.rtype = rtype;
        this.rdata = rdata;
        this.pool = pool;
        this.isDisabled = isDisabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name for the answer, unique within the steering policy.
         * An answer's {@code name} property can be referenced in {@code answerCondition} properties
         * of rules using {@code answer.name}.
         * <p>
         **Example:**
         * <p>
         * "rules": [
         *     {
         *       "ruleType": "FILTER",
         *       "defaultAnswerData":  [
         *         {
         *           "answerCondition": "answer.name == 'server 1'",
         *           "shouldKeep": true
         *         }
         *       ]
         *     }
         *   ]
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A user-friendly name for the answer, unique within the steering policy.
         * An answer's {@code name} property can be referenced in {@code answerCondition} properties
         * of rules using {@code answer.name}.
         * <p>
         **Example:**
         * <p>
         * "rules": [
         *     {
         *       "ruleType": "FILTER",
         *       "defaultAnswerData":  [
         *         {
         *           "answerCondition": "answer.name == 'server 1'",
         *           "shouldKeep": true
         *         }
         *       ]
         *     }
         *   ]
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The type of DNS record, such as A or CNAME. Only A, AAAA, and CNAME are supported. For more
         * information, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rtype")
        private String rtype;

        /**
         * The type of DNS record, such as A or CNAME. Only A, AAAA, and CNAME are supported. For more
         * information, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm).
         *
         * @param rtype the value to set
         * @return this builder
         **/
        public Builder rtype(String rtype) {
            this.rtype = rtype;
            this.__explicitlySet__.add("rtype");
            return this;
        }
        /**
         * The record's data, as whitespace-delimited tokens in
         * type-specific presentation format. All RDATA is normalized and the
         * returned presentation of your RDATA may differ from its initial input.
         * For more information about RDATA, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rdata")
        private String rdata;

        /**
         * The record's data, as whitespace-delimited tokens in
         * type-specific presentation format. All RDATA is normalized and the
         * returned presentation of your RDATA may differ from its initial input.
         * For more information about RDATA, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm).
         *
         * @param rdata the value to set
         * @return this builder
         **/
        public Builder rdata(String rdata) {
            this.rdata = rdata;
            this.__explicitlySet__.add("rdata");
            return this;
        }
        /**
         * The freeform name of a group of one or more records in which this record is included,
         * such as "LAX data center". An answer's {@code pool} property can be referenced in {@code answerCondition}
         * properties of rules using {@code answer.pool}.
         * <p>
         **Example:**
         * <p>
         * "rules": [
         *     {
         *       "ruleType": "FILTER",
         *       "defaultAnswerData":  [
         *         {
         *           "answerCondition": "answer.pool == 'US East Servers'",
         *           "shouldKeep": true
         *         }
         *       ]
         *     }
         *   ]
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pool")
        private String pool;

        /**
         * The freeform name of a group of one or more records in which this record is included,
         * such as "LAX data center". An answer's {@code pool} property can be referenced in {@code answerCondition}
         * properties of rules using {@code answer.pool}.
         * <p>
         **Example:**
         * <p>
         * "rules": [
         *     {
         *       "ruleType": "FILTER",
         *       "defaultAnswerData":  [
         *         {
         *           "answerCondition": "answer.pool == 'US East Servers'",
         *           "shouldKeep": true
         *         }
         *       ]
         *     }
         *   ]
         *
         * @param pool the value to set
         * @return this builder
         **/
        public Builder pool(String pool) {
            this.pool = pool;
            this.__explicitlySet__.add("pool");
            return this;
        }
        /**
         * Set this property to {@code true} to indicate that the answer is administratively disabled,
         * such as when the corresponding server is down for maintenance. An answer's {@code isDisabled}
         * property can be referenced in {@code answerCondition} properties in rules using {@code answer.isDisabled}.
         * <p>
         **Example:**
         *   "rules": [
         *     {
         *       "ruleType": "FILTER",
         *       "defaultAnswerData": [
         *         {
         *           "answerCondition": "answer.isDisabled != true",
         *           "shouldKeep": true
         *         }
         *       ]
         *     },
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDisabled")
        private Boolean isDisabled;

        /**
         * Set this property to {@code true} to indicate that the answer is administratively disabled,
         * such as when the corresponding server is down for maintenance. An answer's {@code isDisabled}
         * property can be referenced in {@code answerCondition} properties in rules using {@code answer.isDisabled}.
         * <p>
         **Example:**
         *   "rules": [
         *     {
         *       "ruleType": "FILTER",
         *       "defaultAnswerData": [
         *         {
         *           "answerCondition": "answer.isDisabled != true",
         *           "shouldKeep": true
         *         }
         *       ]
         *     },
         *
         * @param isDisabled the value to set
         * @return this builder
         **/
        public Builder isDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            this.__explicitlySet__.add("isDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyAnswer build() {
            SteeringPolicyAnswer model =
                    new SteeringPolicyAnswer(
                            this.name, this.rtype, this.rdata, this.pool, this.isDisabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyAnswer model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("rtype")) {
                this.rtype(model.getRtype());
            }
            if (model.wasPropertyExplicitlySet("rdata")) {
                this.rdata(model.getRdata());
            }
            if (model.wasPropertyExplicitlySet("pool")) {
                this.pool(model.getPool());
            }
            if (model.wasPropertyExplicitlySet("isDisabled")) {
                this.isDisabled(model.getIsDisabled());
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
     * A user-friendly name for the answer, unique within the steering policy.
     * An answer's {@code name} property can be referenced in {@code answerCondition} properties
     * of rules using {@code answer.name}.
     * <p>
     **Example:**
     * <p>
     * "rules": [
     *     {
     *       "ruleType": "FILTER",
     *       "defaultAnswerData":  [
     *         {
     *           "answerCondition": "answer.name == 'server 1'",
     *           "shouldKeep": true
     *         }
     *       ]
     *     }
     *   ]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A user-friendly name for the answer, unique within the steering policy.
     * An answer's {@code name} property can be referenced in {@code answerCondition} properties
     * of rules using {@code answer.name}.
     * <p>
     **Example:**
     * <p>
     * "rules": [
     *     {
     *       "ruleType": "FILTER",
     *       "defaultAnswerData":  [
     *         {
     *           "answerCondition": "answer.name == 'server 1'",
     *           "shouldKeep": true
     *         }
     *       ]
     *     }
     *   ]
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The type of DNS record, such as A or CNAME. Only A, AAAA, and CNAME are supported. For more
     * information, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rtype")
    private final String rtype;

    /**
     * The type of DNS record, such as A or CNAME. Only A, AAAA, and CNAME are supported. For more
     * information, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm).
     *
     * @return the value
     **/
    public String getRtype() {
        return rtype;
    }

    /**
     * The record's data, as whitespace-delimited tokens in
     * type-specific presentation format. All RDATA is normalized and the
     * returned presentation of your RDATA may differ from its initial input.
     * For more information about RDATA, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rdata")
    private final String rdata;

    /**
     * The record's data, as whitespace-delimited tokens in
     * type-specific presentation format. All RDATA is normalized and the
     * returned presentation of your RDATA may differ from its initial input.
     * For more information about RDATA, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm).
     *
     * @return the value
     **/
    public String getRdata() {
        return rdata;
    }

    /**
     * The freeform name of a group of one or more records in which this record is included,
     * such as "LAX data center". An answer's {@code pool} property can be referenced in {@code answerCondition}
     * properties of rules using {@code answer.pool}.
     * <p>
     **Example:**
     * <p>
     * "rules": [
     *     {
     *       "ruleType": "FILTER",
     *       "defaultAnswerData":  [
     *         {
     *           "answerCondition": "answer.pool == 'US East Servers'",
     *           "shouldKeep": true
     *         }
     *       ]
     *     }
     *   ]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pool")
    private final String pool;

    /**
     * The freeform name of a group of one or more records in which this record is included,
     * such as "LAX data center". An answer's {@code pool} property can be referenced in {@code answerCondition}
     * properties of rules using {@code answer.pool}.
     * <p>
     **Example:**
     * <p>
     * "rules": [
     *     {
     *       "ruleType": "FILTER",
     *       "defaultAnswerData":  [
     *         {
     *           "answerCondition": "answer.pool == 'US East Servers'",
     *           "shouldKeep": true
     *         }
     *       ]
     *     }
     *   ]
     *
     * @return the value
     **/
    public String getPool() {
        return pool;
    }

    /**
     * Set this property to {@code true} to indicate that the answer is administratively disabled,
     * such as when the corresponding server is down for maintenance. An answer's {@code isDisabled}
     * property can be referenced in {@code answerCondition} properties in rules using {@code answer.isDisabled}.
     * <p>
     **Example:**
     *   "rules": [
     *     {
     *       "ruleType": "FILTER",
     *       "defaultAnswerData": [
     *         {
     *           "answerCondition": "answer.isDisabled != true",
     *           "shouldKeep": true
     *         }
     *       ]
     *     },
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDisabled")
    private final Boolean isDisabled;

    /**
     * Set this property to {@code true} to indicate that the answer is administratively disabled,
     * such as when the corresponding server is down for maintenance. An answer's {@code isDisabled}
     * property can be referenced in {@code answerCondition} properties in rules using {@code answer.isDisabled}.
     * <p>
     **Example:**
     *   "rules": [
     *     {
     *       "ruleType": "FILTER",
     *       "defaultAnswerData": [
     *         {
     *           "answerCondition": "answer.isDisabled != true",
     *           "shouldKeep": true
     *         }
     *       ]
     *     },
     *
     * @return the value
     **/
    public Boolean getIsDisabled() {
        return isDisabled;
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
        sb.append("SteeringPolicyAnswer(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", rtype=").append(String.valueOf(this.rtype));
        sb.append(", rdata=").append(String.valueOf(this.rdata));
        sb.append(", pool=").append(String.valueOf(this.pool));
        sb.append(", isDisabled=").append(String.valueOf(this.isDisabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SteeringPolicyAnswer)) {
            return false;
        }

        SteeringPolicyAnswer other = (SteeringPolicyAnswer) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.rtype, other.rtype)
                && java.util.Objects.equals(this.rdata, other.rdata)
                && java.util.Objects.equals(this.pool, other.pool)
                && java.util.Objects.equals(this.isDisabled, other.isDisabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.rtype == null ? 43 : this.rtype.hashCode());
        result = (result * PRIME) + (this.rdata == null ? 43 : this.rdata.hashCode());
        result = (result * PRIME) + (this.pool == null ? 43 : this.pool.hashCode());
        result = (result * PRIME) + (this.isDisabled == null ? 43 : this.isDisabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
