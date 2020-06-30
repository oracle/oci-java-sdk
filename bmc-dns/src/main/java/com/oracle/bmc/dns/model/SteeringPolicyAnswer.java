/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SteeringPolicyAnswer.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SteeringPolicyAnswer {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rtype")
        private String rtype;

        public Builder rtype(String rtype) {
            this.rtype = rtype;
            this.__explicitlySet__.add("rtype");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rdata")
        private String rdata;

        public Builder rdata(String rdata) {
            this.rdata = rdata;
            this.__explicitlySet__.add("rdata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pool")
        private String pool;

        public Builder pool(String pool) {
            this.pool = pool;
            this.__explicitlySet__.add("pool");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDisabled")
        private Boolean isDisabled;

        public Builder isDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            this.__explicitlySet__.add("isDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyAnswer build() {
            SteeringPolicyAnswer __instance__ =
                    new SteeringPolicyAnswer(name, rtype, rdata, pool, isDisabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyAnswer o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .rtype(o.getRtype())
                            .rdata(o.getRdata())
                            .pool(o.getPool())
                            .isDisabled(o.getIsDisabled());

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

    /**
     * A user-friendly name for the answer, unique within the steering policy.
     * An answer's `name` property can be referenced in `answerCondition` properties
     * of rules using `answer.name`.
     * <p>
     **Example:**
     * <p>
     * \"rules\": [
     *     {
     *       \"ruleType\": \"FILTER\",
     *       \"defaultAnswerData\":  [
     *         {
     *           \"answerCondition\": \"answer.name == 'server 1'\",
     *           \"shouldKeep\": true
     *         }
     *       ]
     *     }
     *   ]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The canonical name for the record's type. Only A, AAAA, and CNAME are supported. For more
     * information, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rtype")
    String rtype;

    /**
     * The record's data, as whitespace-delimited tokens in
     * type-specific presentation format. All RDATA is normalized and the
     * returned presentation of your RDATA may differ from its initial input.
     * For more information about RDATA, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rdata")
    String rdata;

    /**
     * The freeform name of a group of one or more records in which this record is included,
     * such as \"LAX data center\". An answer's `pool` property can be referenced in `answerCondition`
     * properties of rules using `answer.pool`.
     * <p>
     **Example:**
     * <p>
     * \"rules\": [
     *     {
     *       \"ruleType\": \"FILTER\",
     *       \"defaultAnswerData\":  [
     *         {
     *           \"answerCondition\": \"answer.pool == 'US East Servers'\",
     *           \"shouldKeep\": true
     *         }
     *       ]
     *     }
     *   ]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pool")
    String pool;

    /**
     * Set this property to `true` to indicate that the answer is administratively disabled,
     * such as when the corresponding server is down for maintenance. An answer's `isDisabled`
     * property can be referenced in `answerCondition` properties in rules using `answer.isDisabled`.
     * <p>
     **Example:**
     *   \"rules\": [
     *     {
     *       \"ruleType\": \"FILTER\",
     *       \"defaultAnswerData\": [
     *         {
     *           \"answerCondition\": \"answer.isDisabled != true\",
     *           \"shouldKeep\": true
     *         }
     *       ]
     *     },
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDisabled")
    Boolean isDisabled;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
