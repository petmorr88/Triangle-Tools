package triangle.codeGenerator.entities;

import triangle.abstractMachine.Machine;
import triangle.abstractMachine.OpCode;
import triangle.abstractMachine.Primitive;
import triangle.abstractMachine.Register;
import triangle.codeGenerator.Emitter;
import triangle.codeGenerator.Frame;

public class DecrementPrimitiveRoutine extends RuntimeEntity implements RoutineEntity {

	public DecrementPrimitiveRoutine() {
		super(Machine.closureSize);
	}

	public void encodeCall(Emitter emitter, Frame frame) {
		emitter.emit(OpCode.LOADL, 0, 1);
		emitter.emit(OpCode.CALL, Register.PB, Primitive.MULT);
	}

	public void encodeFetch(Emitter emitter, Frame frame) {
		emitter.emit(OpCode.LOADA, 0, Register.SB, 0);
		emitter.emit(OpCode.LOADA, Register.PB, Primitive.MULT);
	}

}
