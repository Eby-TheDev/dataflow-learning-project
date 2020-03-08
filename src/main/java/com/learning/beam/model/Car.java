/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.learning.beam.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Car extends org.apache.avro.specific.SpecificRecordBase
		implements org.apache.avro.specific.SpecificRecord {
	private static final long serialVersionUID = 7601072249898860155L;
	public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse(
			"{\"type\":\"record\",\"name\":\"Car\",\"namespace\":\"com.learning.beam.model\",\"fields\":[{\"name\":\"Car\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"MPG\",\"type\":\"double\"},{\"name\":\"Cylinders\",\"type\":\"int\"},{\"name\":\"Displacement\",\"type\":\"double\"},{\"name\":\"Horsepower\",\"type\":\"double\"},{\"name\":\"Weight\",\"type\":\"double\"},{\"name\":\"Acceleration\",\"type\":\"double\"},{\"name\":\"Model\",\"type\":\"int\"},{\"name\":\"Origin\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");

	public static org.apache.avro.Schema getClassSchema() {
		return SCHEMA$;
	}

	private static SpecificData MODEL$ = new SpecificData();

	private static final BinaryMessageEncoder<Car> ENCODER = new BinaryMessageEncoder<Car>(MODEL$, SCHEMA$);

	private static final BinaryMessageDecoder<Car> DECODER = new BinaryMessageDecoder<Car>(MODEL$, SCHEMA$);

	/**
	 * Return the BinaryMessageEncoder instance used by this class.
	 * 
	 * @return the message encoder used by this class
	 */
	public static BinaryMessageEncoder<Car> getEncoder() {
		return ENCODER;
	}

	/**
	 * Return the BinaryMessageDecoder instance used by this class.
	 * 
	 * @return the message decoder used by this class
	 */
	public static BinaryMessageDecoder<Car> getDecoder() {
		return DECODER;
	}

	/**
	 * Create a new BinaryMessageDecoder instance for this class that uses the
	 * specified {@link SchemaStore}.
	 * 
	 * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
	 * @return a BinaryMessageDecoder instance for this class backed by the given
	 *         SchemaStore
	 */
	public static BinaryMessageDecoder<Car> createDecoder(SchemaStore resolver) {
		return new BinaryMessageDecoder<Car>(MODEL$, SCHEMA$, resolver);
	}

	/**
	 * Serializes this Car to a ByteBuffer.
	 * 
	 * @return a buffer holding the serialized data for this instance
	 * @throws java.io.IOException if this instance could not be serialized
	 */
	public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
		return ENCODER.encode(this);
	}

	/**
	 * Deserializes a Car from a ByteBuffer.
	 * 
	 * @param b a byte buffer holding serialized data for an instance of this class
	 * @return a Car instance decoded from the given buffer
	 * @throws java.io.IOException if the given bytes could not be deserialized into
	 *                             an instance of this class
	 */
	public static Car fromByteBuffer(java.nio.ByteBuffer b) throws java.io.IOException {
		return DECODER.decode(b);
	}

	@Deprecated
	public java.lang.String Car;
	@Deprecated
	public double MPG;
	@Deprecated
	public int Cylinders;
	@Deprecated
	public double Displacement;
	@Deprecated
	public double Horsepower;
	@Deprecated
	public double Weight;
	@Deprecated
	public double Acceleration;
	@Deprecated
	public int Model;
	@Deprecated
	public java.lang.String Origin;

	/**
	 * Default constructor. Note that this does not initialize fields to their
	 * default values from the schema. If that is desired then one should use
	 * <code>newBuilder()</code>.
	 */
	public Car() {
	}

	/**
	 * All-args constructor.
	 * 
	 * @param Car          The new value for Car
	 * @param MPG          The new value for MPG
	 * @param Cylinders    The new value for Cylinders
	 * @param Displacement The new value for Displacement
	 * @param Horsepower   The new value for Horsepower
	 * @param Weight       The new value for Weight
	 * @param Acceleration The new value for Acceleration
	 * @param Model        The new value for Model
	 * @param Origin       The new value for Origin
	 */
	public Car(java.lang.String Car, java.lang.Double MPG, java.lang.Integer Cylinders, java.lang.Double Displacement,
			java.lang.Double Horsepower, java.lang.Double Weight, java.lang.Double Acceleration,
			java.lang.Integer Model, java.lang.String Origin) {
		this.Car = Car;
		this.MPG = MPG;
		this.Cylinders = Cylinders;
		this.Displacement = Displacement;
		this.Horsepower = Horsepower;
		this.Weight = Weight;
		this.Acceleration = Acceleration;
		this.Model = Model;
		this.Origin = Origin;
	}

	public org.apache.avro.specific.SpecificData getSpecificData() {
		return MODEL$;
	}

	public org.apache.avro.Schema getSchema() {
		return SCHEMA$;
	}

	// Used by DatumWriter. Applications should not call.
	public java.lang.Object get(int field$) {
		switch (field$) {
		case 0:
			return Car;
		case 1:
			return MPG;
		case 2:
			return Cylinders;
		case 3:
			return Displacement;
		case 4:
			return Horsepower;
		case 5:
			return Weight;
		case 6:
			return Acceleration;
		case 7:
			return Model;
		case 8:
			return Origin;
		default:
			throw new org.apache.avro.AvroRuntimeException("Bad index");
		}
	}

	// Used by DatumReader. Applications should not call.
	@SuppressWarnings(value = "unchecked")
	public void put(int field$, java.lang.Object value$) {
		switch (field$) {
		case 0:
			Car = (java.lang.String) value$;
			break;
		case 1:
			MPG = (java.lang.Double) value$;
			break;
		case 2:
			Cylinders = (java.lang.Integer) value$;
			break;
		case 3:
			Displacement = (java.lang.Double) value$;
			break;
		case 4:
			Horsepower = (java.lang.Double) value$;
			break;
		case 5:
			Weight = (java.lang.Double) value$;
			break;
		case 6:
			Acceleration = (java.lang.Double) value$;
			break;
		case 7:
			Model = (java.lang.Integer) value$;
			break;
		case 8:
			Origin = (java.lang.String) value$;
			break;
		default:
			throw new org.apache.avro.AvroRuntimeException("Bad index");
		}
	}

	/**
	 * Gets the value of the 'Car' field.
	 * 
	 * @return The value of the 'Car' field.
	 */
	public java.lang.String getCar() {
		return Car;
	}

	/**
	 * Sets the value of the 'Car' field.
	 * 
	 * @param value the value to set.
	 */
	public void setCar(java.lang.String value) {
		this.Car = value;
	}

	/**
	 * Gets the value of the 'MPG' field.
	 * 
	 * @return The value of the 'MPG' field.
	 */
	public double getMPG() {
		return MPG;
	}

	/**
	 * Sets the value of the 'MPG' field.
	 * 
	 * @param value the value to set.
	 */
	public void setMPG(double value) {
		this.MPG = value;
	}

	/**
	 * Gets the value of the 'Cylinders' field.
	 * 
	 * @return The value of the 'Cylinders' field.
	 */
	public int getCylinders() {
		return Cylinders;
	}

	/**
	 * Sets the value of the 'Cylinders' field.
	 * 
	 * @param value the value to set.
	 */
	public void setCylinders(int value) {
		this.Cylinders = value;
	}

	/**
	 * Gets the value of the 'Displacement' field.
	 * 
	 * @return The value of the 'Displacement' field.
	 */
	public double getDisplacement() {
		return Displacement;
	}

	/**
	 * Sets the value of the 'Displacement' field.
	 * 
	 * @param value the value to set.
	 */
	public void setDisplacement(double value) {
		this.Displacement = value;
	}

	/**
	 * Gets the value of the 'Horsepower' field.
	 * 
	 * @return The value of the 'Horsepower' field.
	 */
	public double getHorsepower() {
		return Horsepower;
	}

	/**
	 * Sets the value of the 'Horsepower' field.
	 * 
	 * @param value the value to set.
	 */
	public void setHorsepower(double value) {
		this.Horsepower = value;
	}

	/**
	 * Gets the value of the 'Weight' field.
	 * 
	 * @return The value of the 'Weight' field.
	 */
	public double getWeight() {
		return Weight;
	}

	/**
	 * Sets the value of the 'Weight' field.
	 * 
	 * @param value the value to set.
	 */
	public void setWeight(double value) {
		this.Weight = value;
	}

	/**
	 * Gets the value of the 'Acceleration' field.
	 * 
	 * @return The value of the 'Acceleration' field.
	 */
	public double getAcceleration() {
		return Acceleration;
	}

	/**
	 * Sets the value of the 'Acceleration' field.
	 * 
	 * @param value the value to set.
	 */
	public void setAcceleration(double value) {
		this.Acceleration = value;
	}

	/**
	 * Gets the value of the 'Model' field.
	 * 
	 * @return The value of the 'Model' field.
	 */
	public int getModel() {
		return Model;
	}

	/**
	 * Sets the value of the 'Model' field.
	 * 
	 * @param value the value to set.
	 */
	public void setModel(int value) {
		this.Model = value;
	}

	/**
	 * Gets the value of the 'Origin' field.
	 * 
	 * @return The value of the 'Origin' field.
	 */
	public java.lang.String getOrigin() {
		return Origin;
	}

	/**
	 * Sets the value of the 'Origin' field.
	 * 
	 * @param value the value to set.
	 */
	public void setOrigin(java.lang.String value) {
		this.Origin = value;
	}

	/**
	 * Creates a new Car RecordBuilder.
	 * 
	 * @return A new Car RecordBuilder
	 */
	public static com.learning.beam.model.Car.Builder newBuilder() {
		return new com.learning.beam.model.Car.Builder();
	}

	/**
	 * Creates a new Car RecordBuilder by copying an existing Builder.
	 * 
	 * @param other The existing builder to copy.
	 * @return A new Car RecordBuilder
	 */
	public static com.learning.beam.model.Car.Builder newBuilder(com.learning.beam.model.Car.Builder other) {
		if (other == null) {
			return new com.learning.beam.model.Car.Builder();
		} else {
			return new com.learning.beam.model.Car.Builder(other);
		}
	}

	/**
	 * Creates a new Car RecordBuilder by copying an existing Car instance.
	 * 
	 * @param other The existing instance to copy.
	 * @return A new Car RecordBuilder
	 */
	public static com.learning.beam.model.Car.Builder newBuilder(com.learning.beam.model.Car other) {
		if (other == null) {
			return new com.learning.beam.model.Car.Builder();
		} else {
			return new com.learning.beam.model.Car.Builder(other);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(Acceleration);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((Car == null) ? 0 : Car.hashCode());
		result = prime * result + Cylinders;
		temp = Double.doubleToLongBits(Displacement);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Horsepower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(MPG);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Model;
		result = prime * result + ((Origin == null) ? 0 : Origin.hashCode());
		temp = Double.doubleToLongBits(Weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (Double.doubleToLongBits(Acceleration) != Double.doubleToLongBits(other.Acceleration))
			return false;
		if (Car == null) {
			if (other.Car != null)
				return false;
		} else if (!Car.equals(other.Car))
			return false;
		if (Cylinders != other.Cylinders)
			return false;
		if (Double.doubleToLongBits(Displacement) != Double.doubleToLongBits(other.Displacement))
			return false;
		if (Double.doubleToLongBits(Horsepower) != Double.doubleToLongBits(other.Horsepower))
			return false;
		if (Double.doubleToLongBits(MPG) != Double.doubleToLongBits(other.MPG))
			return false;
		if (Model != other.Model)
			return false;
		if (Origin == null) {
			if (other.Origin != null)
				return false;
		} else if (!Origin.equals(other.Origin))
			return false;
		if (Double.doubleToLongBits(Weight) != Double.doubleToLongBits(other.Weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [Car=" + Car + ", MPG=" + MPG + ", Cylinders=" + Cylinders + ", Displacement=" + Displacement
				+ ", Horsepower=" + Horsepower + ", Weight=" + Weight + ", Acceleration=" + Acceleration + ", Model="
				+ Model + ", Origin=" + Origin + "]";
	}

	/**
	 * RecordBuilder for Car instances.
	 */
	public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Car>
			implements org.apache.avro.data.RecordBuilder<Car> {

		private java.lang.String Car;
		private double MPG;
		private int Cylinders;
		private double Displacement;
		private double Horsepower;
		private double Weight;
		private double Acceleration;
		private int Model;
		private java.lang.String Origin;

		/** Creates a new Builder */
		private Builder() {
			super(SCHEMA$);
		}

		/**
		 * Creates a Builder by copying an existing Builder.
		 * 
		 * @param other The existing Builder to copy.
		 */
		private Builder(com.learning.beam.model.Car.Builder other) {
			super(other);
			if (isValidValue(fields()[0], other.Car)) {
				this.Car = data().deepCopy(fields()[0].schema(), other.Car);
				fieldSetFlags()[0] = other.fieldSetFlags()[0];
			}
			if (isValidValue(fields()[1], other.MPG)) {
				this.MPG = data().deepCopy(fields()[1].schema(), other.MPG);
				fieldSetFlags()[1] = other.fieldSetFlags()[1];
			}
			if (isValidValue(fields()[2], other.Cylinders)) {
				this.Cylinders = data().deepCopy(fields()[2].schema(), other.Cylinders);
				fieldSetFlags()[2] = other.fieldSetFlags()[2];
			}
			if (isValidValue(fields()[3], other.Displacement)) {
				this.Displacement = data().deepCopy(fields()[3].schema(), other.Displacement);
				fieldSetFlags()[3] = other.fieldSetFlags()[3];
			}
			if (isValidValue(fields()[4], other.Horsepower)) {
				this.Horsepower = data().deepCopy(fields()[4].schema(), other.Horsepower);
				fieldSetFlags()[4] = other.fieldSetFlags()[4];
			}
			if (isValidValue(fields()[5], other.Weight)) {
				this.Weight = data().deepCopy(fields()[5].schema(), other.Weight);
				fieldSetFlags()[5] = other.fieldSetFlags()[5];
			}
			if (isValidValue(fields()[6], other.Acceleration)) {
				this.Acceleration = data().deepCopy(fields()[6].schema(), other.Acceleration);
				fieldSetFlags()[6] = other.fieldSetFlags()[6];
			}
			if (isValidValue(fields()[7], other.Model)) {
				this.Model = data().deepCopy(fields()[7].schema(), other.Model);
				fieldSetFlags()[7] = other.fieldSetFlags()[7];
			}
			if (isValidValue(fields()[8], other.Origin)) {
				this.Origin = data().deepCopy(fields()[8].schema(), other.Origin);
				fieldSetFlags()[8] = other.fieldSetFlags()[8];
			}
		}

		/**
		 * Creates a Builder by copying an existing Car instance
		 * 
		 * @param other The existing instance to copy.
		 */
		private Builder(com.learning.beam.model.Car other) {
			super(SCHEMA$);
			if (isValidValue(fields()[0], other.Car)) {
				this.Car = data().deepCopy(fields()[0].schema(), other.Car);
				fieldSetFlags()[0] = true;
			}
			if (isValidValue(fields()[1], other.MPG)) {
				this.MPG = data().deepCopy(fields()[1].schema(), other.MPG);
				fieldSetFlags()[1] = true;
			}
			if (isValidValue(fields()[2], other.Cylinders)) {
				this.Cylinders = data().deepCopy(fields()[2].schema(), other.Cylinders);
				fieldSetFlags()[2] = true;
			}
			if (isValidValue(fields()[3], other.Displacement)) {
				this.Displacement = data().deepCopy(fields()[3].schema(), other.Displacement);
				fieldSetFlags()[3] = true;
			}
			if (isValidValue(fields()[4], other.Horsepower)) {
				this.Horsepower = data().deepCopy(fields()[4].schema(), other.Horsepower);
				fieldSetFlags()[4] = true;
			}
			if (isValidValue(fields()[5], other.Weight)) {
				this.Weight = data().deepCopy(fields()[5].schema(), other.Weight);
				fieldSetFlags()[5] = true;
			}
			if (isValidValue(fields()[6], other.Acceleration)) {
				this.Acceleration = data().deepCopy(fields()[6].schema(), other.Acceleration);
				fieldSetFlags()[6] = true;
			}
			if (isValidValue(fields()[7], other.Model)) {
				this.Model = data().deepCopy(fields()[7].schema(), other.Model);
				fieldSetFlags()[7] = true;
			}
			if (isValidValue(fields()[8], other.Origin)) {
				this.Origin = data().deepCopy(fields()[8].schema(), other.Origin);
				fieldSetFlags()[8] = true;
			}
		}

		/**
		 * Gets the value of the 'Car' field.
		 * 
		 * @return The value.
		 */
		public java.lang.String getCar() {
			return Car;
		}

		/**
		 * Sets the value of the 'Car' field.
		 * 
		 * @param value The value of 'Car'.
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder setCar(java.lang.String value) {
			validate(fields()[0], value);
			this.Car = value;
			fieldSetFlags()[0] = true;
			return this;
		}

		/**
		 * Checks whether the 'Car' field has been set.
		 * 
		 * @return True if the 'Car' field has been set, false otherwise.
		 */
		public boolean hasCar() {
			return fieldSetFlags()[0];
		}

		/**
		 * Clears the value of the 'Car' field.
		 * 
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder clearCar() {
			Car = null;
			fieldSetFlags()[0] = false;
			return this;
		}

		/**
		 * Gets the value of the 'MPG' field.
		 * 
		 * @return The value.
		 */
		public double getMPG() {
			return MPG;
		}

		/**
		 * Sets the value of the 'MPG' field.
		 * 
		 * @param value The value of 'MPG'.
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder setMPG(double value) {
			validate(fields()[1], value);
			this.MPG = value;
			fieldSetFlags()[1] = true;
			return this;
		}

		/**
		 * Checks whether the 'MPG' field has been set.
		 * 
		 * @return True if the 'MPG' field has been set, false otherwise.
		 */
		public boolean hasMPG() {
			return fieldSetFlags()[1];
		}

		/**
		 * Clears the value of the 'MPG' field.
		 * 
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder clearMPG() {
			fieldSetFlags()[1] = false;
			return this;
		}

		/**
		 * Gets the value of the 'Cylinders' field.
		 * 
		 * @return The value.
		 */
		public int getCylinders() {
			return Cylinders;
		}

		/**
		 * Sets the value of the 'Cylinders' field.
		 * 
		 * @param value The value of 'Cylinders'.
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder setCylinders(int value) {
			validate(fields()[2], value);
			this.Cylinders = value;
			fieldSetFlags()[2] = true;
			return this;
		}

		/**
		 * Checks whether the 'Cylinders' field has been set.
		 * 
		 * @return True if the 'Cylinders' field has been set, false otherwise.
		 */
		public boolean hasCylinders() {
			return fieldSetFlags()[2];
		}

		/**
		 * Clears the value of the 'Cylinders' field.
		 * 
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder clearCylinders() {
			fieldSetFlags()[2] = false;
			return this;
		}

		/**
		 * Gets the value of the 'Displacement' field.
		 * 
		 * @return The value.
		 */
		public double getDisplacement() {
			return Displacement;
		}

		/**
		 * Sets the value of the 'Displacement' field.
		 * 
		 * @param value The value of 'Displacement'.
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder setDisplacement(double value) {
			validate(fields()[3], value);
			this.Displacement = value;
			fieldSetFlags()[3] = true;
			return this;
		}

		/**
		 * Checks whether the 'Displacement' field has been set.
		 * 
		 * @return True if the 'Displacement' field has been set, false otherwise.
		 */
		public boolean hasDisplacement() {
			return fieldSetFlags()[3];
		}

		/**
		 * Clears the value of the 'Displacement' field.
		 * 
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder clearDisplacement() {
			fieldSetFlags()[3] = false;
			return this;
		}

		/**
		 * Gets the value of the 'Horsepower' field.
		 * 
		 * @return The value.
		 */
		public double getHorsepower() {
			return Horsepower;
		}

		/**
		 * Sets the value of the 'Horsepower' field.
		 * 
		 * @param value The value of 'Horsepower'.
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder setHorsepower(double value) {
			validate(fields()[4], value);
			this.Horsepower = value;
			fieldSetFlags()[4] = true;
			return this;
		}

		/**
		 * Checks whether the 'Horsepower' field has been set.
		 * 
		 * @return True if the 'Horsepower' field has been set, false otherwise.
		 */
		public boolean hasHorsepower() {
			return fieldSetFlags()[4];
		}

		/**
		 * Clears the value of the 'Horsepower' field.
		 * 
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder clearHorsepower() {
			fieldSetFlags()[4] = false;
			return this;
		}

		/**
		 * Gets the value of the 'Weight' field.
		 * 
		 * @return The value.
		 */
		public double getWeight() {
			return Weight;
		}

		/**
		 * Sets the value of the 'Weight' field.
		 * 
		 * @param value The value of 'Weight'.
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder setWeight(double value) {
			validate(fields()[5], value);
			this.Weight = value;
			fieldSetFlags()[5] = true;
			return this;
		}

		/**
		 * Checks whether the 'Weight' field has been set.
		 * 
		 * @return True if the 'Weight' field has been set, false otherwise.
		 */
		public boolean hasWeight() {
			return fieldSetFlags()[5];
		}

		/**
		 * Clears the value of the 'Weight' field.
		 * 
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder clearWeight() {
			fieldSetFlags()[5] = false;
			return this;
		}

		/**
		 * Gets the value of the 'Acceleration' field.
		 * 
		 * @return The value.
		 */
		public double getAcceleration() {
			return Acceleration;
		}

		/**
		 * Sets the value of the 'Acceleration' field.
		 * 
		 * @param value The value of 'Acceleration'.
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder setAcceleration(double value) {
			validate(fields()[6], value);
			this.Acceleration = value;
			fieldSetFlags()[6] = true;
			return this;
		}

		/**
		 * Checks whether the 'Acceleration' field has been set.
		 * 
		 * @return True if the 'Acceleration' field has been set, false otherwise.
		 */
		public boolean hasAcceleration() {
			return fieldSetFlags()[6];
		}

		/**
		 * Clears the value of the 'Acceleration' field.
		 * 
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder clearAcceleration() {
			fieldSetFlags()[6] = false;
			return this;
		}

		/**
		 * Gets the value of the 'Model' field.
		 * 
		 * @return The value.
		 */
		public int getModel() {
			return Model;
		}

		/**
		 * Sets the value of the 'Model' field.
		 * 
		 * @param value The value of 'Model'.
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder setModel(int value) {
			validate(fields()[7], value);
			this.Model = value;
			fieldSetFlags()[7] = true;
			return this;
		}

		/**
		 * Checks whether the 'Model' field has been set.
		 * 
		 * @return True if the 'Model' field has been set, false otherwise.
		 */
		public boolean hasModel() {
			return fieldSetFlags()[7];
		}

		/**
		 * Clears the value of the 'Model' field.
		 * 
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder clearModel() {
			fieldSetFlags()[7] = false;
			return this;
		}

		/**
		 * Gets the value of the 'Origin' field.
		 * 
		 * @return The value.
		 */
		public java.lang.String getOrigin() {
			return Origin;
		}

		/**
		 * Sets the value of the 'Origin' field.
		 * 
		 * @param value The value of 'Origin'.
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder setOrigin(java.lang.String value) {
			validate(fields()[8], value);
			this.Origin = value;
			fieldSetFlags()[8] = true;
			return this;
		}

		/**
		 * Checks whether the 'Origin' field has been set.
		 * 
		 * @return True if the 'Origin' field has been set, false otherwise.
		 */
		public boolean hasOrigin() {
			return fieldSetFlags()[8];
		}

		/**
		 * Clears the value of the 'Origin' field.
		 * 
		 * @return This builder.
		 */
		public com.learning.beam.model.Car.Builder clearOrigin() {
			Origin = null;
			fieldSetFlags()[8] = false;
			return this;
		}

		@Override
		@SuppressWarnings("unchecked")
		public Car build() {
			try {
				Car record = new Car();
				record.Car = fieldSetFlags()[0] ? this.Car : (java.lang.String) defaultValue(fields()[0]);
				record.MPG = fieldSetFlags()[1] ? this.MPG : (java.lang.Double) defaultValue(fields()[1]);
				record.Cylinders = fieldSetFlags()[2] ? this.Cylinders : (java.lang.Integer) defaultValue(fields()[2]);
				record.Displacement = fieldSetFlags()[3] ? this.Displacement
						: (java.lang.Double) defaultValue(fields()[3]);
				record.Horsepower = fieldSetFlags()[4] ? this.Horsepower : (java.lang.Double) defaultValue(fields()[4]);
				record.Weight = fieldSetFlags()[5] ? this.Weight : (java.lang.Double) defaultValue(fields()[5]);
				record.Acceleration = fieldSetFlags()[6] ? this.Acceleration
						: (java.lang.Double) defaultValue(fields()[6]);
				record.Model = fieldSetFlags()[7] ? this.Model : (java.lang.Integer) defaultValue(fields()[7]);
				record.Origin = fieldSetFlags()[8] ? this.Origin : (java.lang.String) defaultValue(fields()[8]);
				return record;
			} catch (org.apache.avro.AvroMissingFieldException e) {
				throw e;
			} catch (java.lang.Exception e) {
				throw new org.apache.avro.AvroRuntimeException(e);
			}
		}
	}

	@SuppressWarnings("unchecked")
	private static final org.apache.avro.io.DatumWriter<Car> WRITER$ = (org.apache.avro.io.DatumWriter<Car>) MODEL$
			.createDatumWriter(SCHEMA$);

	@Override
	public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
		WRITER$.write(this, SpecificData.getEncoder(out));
	}

	@SuppressWarnings("unchecked")
	private static final org.apache.avro.io.DatumReader<Car> READER$ = (org.apache.avro.io.DatumReader<Car>) MODEL$
			.createDatumReader(SCHEMA$);

	@Override
	public void readExternal(java.io.ObjectInput in) throws java.io.IOException {
		READER$.read(this, SpecificData.getDecoder(in));
	}

	@Override
	protected boolean hasCustomCoders() {
		return true;
	}

	@Override
	public void customEncode(org.apache.avro.io.Encoder out) throws java.io.IOException {
		out.writeString(this.Car);

		out.writeDouble(this.MPG);

		out.writeInt(this.Cylinders);

		out.writeDouble(this.Displacement);

		out.writeDouble(this.Horsepower);

		out.writeDouble(this.Weight);

		out.writeDouble(this.Acceleration);

		out.writeInt(this.Model);

		out.writeString(this.Origin);

	}

	@Override
	public void customDecode(org.apache.avro.io.ResolvingDecoder in) throws java.io.IOException {
		org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
		if (fieldOrder == null) {
			this.Car = in.readString();

			this.MPG = in.readDouble();

			this.Cylinders = in.readInt();

			this.Displacement = in.readDouble();

			this.Horsepower = in.readDouble();

			this.Weight = in.readDouble();

			this.Acceleration = in.readDouble();

			this.Model = in.readInt();

			this.Origin = in.readString();

		} else {
			for (int i = 0; i < 9; i++) {
				switch (fieldOrder[i].pos()) {
				case 0:
					this.Car = in.readString();
					break;

				case 1:
					this.MPG = in.readDouble();
					break;

				case 2:
					this.Cylinders = in.readInt();
					break;

				case 3:
					this.Displacement = in.readDouble();
					break;

				case 4:
					this.Horsepower = in.readDouble();
					break;

				case 5:
					this.Weight = in.readDouble();
					break;

				case 6:
					this.Acceleration = in.readDouble();
					break;

				case 7:
					this.Model = in.readInt();
					break;

				case 8:
					this.Origin = in.readString();
					break;

				default:
					throw new java.io.IOException("Corrupt ResolvingDecoder.");
				}
			}
		}
	}
}