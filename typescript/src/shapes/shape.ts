export type ShapeType = 'circle' | 'rectangle' | 'square'; 

export interface Shape {
  getShape(): ShapeType;
  getSize(): number[]; 
  computeArea(): number;  
}
