import { Shape,ShapeType } from "./shape.js";


function Circle(radius: number): Shape {

    return {
        
        computeArea():  number {
            return Math.PI * radius * radius
        },
        getShape(): ShapeType {
            return 'circle';
          },
        getSize(): number[] {
            return [radius];
          },
        };
}

export { Circle}
