/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.restaurant.avro.schema;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class OrderAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6271473167067977357L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderAvro\",\"namespace\":\"com.example.restaurant.avro.schema\",\"fields\":[{\"name\":\"eventType\",\"type\":\"string\",\"default\":\"ORDER_CREATED\"},{\"name\":\"takeAway\",\"type\":\"boolean\",\"default\":false},{\"name\":\"items\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ItemAvro\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"price\",\"type\":\"double\"}]}},\"default\":[]},{\"name\":\"status\",\"type\":\"string\",\"default\":\"PENDING\"},{\"name\":\"total\",\"type\":\"double\",\"default\":0.0},{\"name\":\"vat\",\"type\":\"double\",\"default\":0.0},{\"name\":\"timestamp\",\"type\":\"string\",\"default\":\"0000.00.00.00.00.00\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OrderAvro> ENCODER =
      new BinaryMessageEncoder<OrderAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OrderAvro> DECODER =
      new BinaryMessageDecoder<OrderAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<OrderAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<OrderAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<OrderAvro>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this OrderAvro to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a OrderAvro from a ByteBuffer. */
  public static OrderAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence eventType;
  @Deprecated public boolean takeAway;
  @Deprecated public java.util.List<com.example.restaurant.avro.schema.ItemAvro> items;
  @Deprecated public java.lang.CharSequence status;
  @Deprecated public double total;
  @Deprecated public double vat;
  @Deprecated public java.lang.CharSequence timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OrderAvro() {}

  /**
   * All-args constructor.
   * @param eventType The new value for eventType
   * @param takeAway The new value for takeAway
   * @param items The new value for items
   * @param status The new value for status
   * @param total The new value for total
   * @param vat The new value for vat
   * @param timestamp The new value for timestamp
   */
  public OrderAvro(java.lang.CharSequence eventType, java.lang.Boolean takeAway, java.util.List<com.example.restaurant.avro.schema.ItemAvro> items, java.lang.CharSequence status, java.lang.Double total, java.lang.Double vat, java.lang.CharSequence timestamp) {
    this.eventType = eventType;
    this.takeAway = takeAway;
    this.items = items;
    this.status = status;
    this.total = total;
    this.vat = vat;
    this.timestamp = timestamp;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return eventType;
    case 1: return takeAway;
    case 2: return items;
    case 3: return status;
    case 4: return total;
    case 5: return vat;
    case 6: return timestamp;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: eventType = (java.lang.CharSequence)value$; break;
    case 1: takeAway = (java.lang.Boolean)value$; break;
    case 2: items = (java.util.List<com.example.restaurant.avro.schema.ItemAvro>)value$; break;
    case 3: status = (java.lang.CharSequence)value$; break;
    case 4: total = (java.lang.Double)value$; break;
    case 5: vat = (java.lang.Double)value$; break;
    case 6: timestamp = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'eventType' field.
   * @return The value of the 'eventType' field.
   */
  public java.lang.CharSequence getEventType() {
    return eventType;
  }

  /**
   * Sets the value of the 'eventType' field.
   * @param value the value to set.
   */
  public void setEventType(java.lang.CharSequence value) {
    this.eventType = value;
  }

  /**
   * Gets the value of the 'takeAway' field.
   * @return The value of the 'takeAway' field.
   */
  public java.lang.Boolean getTakeAway() {
    return takeAway;
  }

  /**
   * Sets the value of the 'takeAway' field.
   * @param value the value to set.
   */
  public void setTakeAway(java.lang.Boolean value) {
    this.takeAway = value;
  }

  /**
   * Gets the value of the 'items' field.
   * @return The value of the 'items' field.
   */
  public java.util.List<com.example.restaurant.avro.schema.ItemAvro> getItems() {
    return items;
  }

  /**
   * Sets the value of the 'items' field.
   * @param value the value to set.
   */
  public void setItems(java.util.List<com.example.restaurant.avro.schema.ItemAvro> value) {
    this.items = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.CharSequence getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.CharSequence value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'total' field.
   * @return The value of the 'total' field.
   */
  public java.lang.Double getTotal() {
    return total;
  }

  /**
   * Sets the value of the 'total' field.
   * @param value the value to set.
   */
  public void setTotal(java.lang.Double value) {
    this.total = value;
  }

  /**
   * Gets the value of the 'vat' field.
   * @return The value of the 'vat' field.
   */
  public java.lang.Double getVat() {
    return vat;
  }

  /**
   * Sets the value of the 'vat' field.
   * @param value the value to set.
   */
  public void setVat(java.lang.Double value) {
    this.vat = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.CharSequence getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.CharSequence value) {
    this.timestamp = value;
  }

  /**
   * Creates a new OrderAvro RecordBuilder.
   * @return A new OrderAvro RecordBuilder
   */
  public static com.example.restaurant.avro.schema.OrderAvro.Builder newBuilder() {
    return new com.example.restaurant.avro.schema.OrderAvro.Builder();
  }

  /**
   * Creates a new OrderAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrderAvro RecordBuilder
   */
  public static com.example.restaurant.avro.schema.OrderAvro.Builder newBuilder(com.example.restaurant.avro.schema.OrderAvro.Builder other) {
    return new com.example.restaurant.avro.schema.OrderAvro.Builder(other);
  }

  /**
   * Creates a new OrderAvro RecordBuilder by copying an existing OrderAvro instance.
   * @param other The existing instance to copy.
   * @return A new OrderAvro RecordBuilder
   */
  public static com.example.restaurant.avro.schema.OrderAvro.Builder newBuilder(com.example.restaurant.avro.schema.OrderAvro other) {
    return new com.example.restaurant.avro.schema.OrderAvro.Builder(other);
  }

  /**
   * RecordBuilder for OrderAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderAvro>
    implements org.apache.avro.data.RecordBuilder<OrderAvro> {

    private java.lang.CharSequence eventType;
    private boolean takeAway;
    private java.util.List<com.example.restaurant.avro.schema.ItemAvro> items;
    private java.lang.CharSequence status;
    private double total;
    private double vat;
    private java.lang.CharSequence timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.restaurant.avro.schema.OrderAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.eventType)) {
        this.eventType = data().deepCopy(fields()[0].schema(), other.eventType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.takeAway)) {
        this.takeAway = data().deepCopy(fields()[1].schema(), other.takeAway);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.items)) {
        this.items = data().deepCopy(fields()[2].schema(), other.items);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.status)) {
        this.status = data().deepCopy(fields()[3].schema(), other.status);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.total)) {
        this.total = data().deepCopy(fields()[4].schema(), other.total);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.vat)) {
        this.vat = data().deepCopy(fields()[5].schema(), other.vat);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[6].schema(), other.timestamp);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing OrderAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.restaurant.avro.schema.OrderAvro other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.eventType)) {
        this.eventType = data().deepCopy(fields()[0].schema(), other.eventType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.takeAway)) {
        this.takeAway = data().deepCopy(fields()[1].schema(), other.takeAway);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.items)) {
        this.items = data().deepCopy(fields()[2].schema(), other.items);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.status)) {
        this.status = data().deepCopy(fields()[3].schema(), other.status);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.total)) {
        this.total = data().deepCopy(fields()[4].schema(), other.total);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.vat)) {
        this.vat = data().deepCopy(fields()[5].schema(), other.vat);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[6].schema(), other.timestamp);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'eventType' field.
      * @return The value.
      */
    public java.lang.CharSequence getEventType() {
      return eventType;
    }

    /**
      * Sets the value of the 'eventType' field.
      * @param value The value of 'eventType'.
      * @return This builder.
      */
    public com.example.restaurant.avro.schema.OrderAvro.Builder setEventType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.eventType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'eventType' field has been set.
      * @return True if the 'eventType' field has been set, false otherwise.
      */
    public boolean hasEventType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'eventType' field.
      * @return This builder.
      */
    public com.example.restaurant.avro.schema.OrderAvro.Builder clearEventType() {
      eventType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'takeAway' field.
      * @return The value.
      */
    public java.lang.Boolean getTakeAway() {
      return takeAway;
    }

    /**
      * Sets the value of the 'takeAway' field.
      * @param value The value of 'takeAway'.
      * @return This builder.
      */
    public com.example.restaurant.avro.schema.OrderAvro.Builder setTakeAway(boolean value) {
      validate(fields()[1], value);
      this.takeAway = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'takeAway' field has been set.
      * @return True if the 'takeAway' field has been set, false otherwise.
      */
    public boolean hasTakeAway() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'takeAway' field.
      * @return This builder.
      */
    public com.example.restaurant.avro.schema.OrderAvro.Builder clearTakeAway() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'items' field.
      * @return The value.
      */
    public java.util.List<com.example.restaurant.avro.schema.ItemAvro> getItems() {
      return items;
    }

    /**
      * Sets the value of the 'items' field.
      * @param value The value of 'items'.
      * @return This builder.
      */
    public com.example.restaurant.avro.schema.OrderAvro.Builder setItems(java.util.List<com.example.restaurant.avro.schema.ItemAvro> value) {
      validate(fields()[2], value);
      this.items = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'items' field has been set.
      * @return True if the 'items' field has been set, false otherwise.
      */
    public boolean hasItems() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'items' field.
      * @return This builder.
      */
    public com.example.restaurant.avro.schema.OrderAvro.Builder clearItems() {
      items = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.CharSequence getStatus() {
      return status;
    }

    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.example.restaurant.avro.schema.OrderAvro.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.status = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.example.restaurant.avro.schema.OrderAvro.Builder clearStatus() {
      status = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'total' field.
      * @return The value.
      */
    public java.lang.Double getTotal() {
      return total;
    }

    /**
      * Sets the value of the 'total' field.
      * @param value The value of 'total'.
      * @return This builder.
      */
    public com.example.restaurant.avro.schema.OrderAvro.Builder setTotal(double value) {
      validate(fields()[4], value);
      this.total = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'total' field has been set.
      * @return True if the 'total' field has been set, false otherwise.
      */
    public boolean hasTotal() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'total' field.
      * @return This builder.
      */
    public com.example.restaurant.avro.schema.OrderAvro.Builder clearTotal() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'vat' field.
      * @return The value.
      */
    public java.lang.Double getVat() {
      return vat;
    }

    /**
      * Sets the value of the 'vat' field.
      * @param value The value of 'vat'.
      * @return This builder.
      */
    public com.example.restaurant.avro.schema.OrderAvro.Builder setVat(double value) {
      validate(fields()[5], value);
      this.vat = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'vat' field has been set.
      * @return True if the 'vat' field has been set, false otherwise.
      */
    public boolean hasVat() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'vat' field.
      * @return This builder.
      */
    public com.example.restaurant.avro.schema.OrderAvro.Builder clearVat() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.CharSequence getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public com.example.restaurant.avro.schema.OrderAvro.Builder setTimestamp(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.timestamp = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public com.example.restaurant.avro.schema.OrderAvro.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrderAvro build() {
      try {
        OrderAvro record = new OrderAvro();
        record.eventType = fieldSetFlags()[0] ? this.eventType : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.takeAway = fieldSetFlags()[1] ? this.takeAway : (java.lang.Boolean) defaultValue(fields()[1]);
        record.items = fieldSetFlags()[2] ? this.items : (java.util.List<com.example.restaurant.avro.schema.ItemAvro>) defaultValue(fields()[2]);
        record.status = fieldSetFlags()[3] ? this.status : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.total = fieldSetFlags()[4] ? this.total : (java.lang.Double) defaultValue(fields()[4]);
        record.vat = fieldSetFlags()[5] ? this.vat : (java.lang.Double) defaultValue(fields()[5]);
        record.timestamp = fieldSetFlags()[6] ? this.timestamp : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrderAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<OrderAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrderAvro>
    READER$ = (org.apache.avro.io.DatumReader<OrderAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
