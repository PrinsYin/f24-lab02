import { Shape,ShapeType } from "./shape.js";

function Rectangle(width: number, height: number): Shape {

    return {
        
        computeArea(): number {
            return width * height
        },
        getShape(): ShapeType {
            return 'circle'
          },
        getSize(): number[] {
            return [width,height]
          },
        };
}

export { Rectangle }
