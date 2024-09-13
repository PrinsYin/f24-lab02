import { Shape,ShapeType } from "./shape.js";

function Square(sideLen: number): Shape {

    return {
        
        computeArea(): number {
            return sideLen*sideLen
        },
        getShape(): ShapeType {
            return 'circle'
          },
        getSize(): number[] {
            return [sideLen]
          },
        };
}



export { Square }

