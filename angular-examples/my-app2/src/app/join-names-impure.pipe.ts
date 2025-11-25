import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'timeString2',
  standalone: false,
  pure:false
})
export class JoinNamesImpurePipe implements PipeTransform {

  transform(value: Date, ...args: unknown[]): unknown {
    console.log('transform(): ', value)
    return value.toLocaleTimeString();
  }

}
